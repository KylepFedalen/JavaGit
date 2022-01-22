/**
 * This template ws designed to be used for Student class objects
 * It may be used for any class object that has an integer id 
 * data element.
 * Header file for Binary Search Tree
 *
 * @author John Jurkiewicz
 * @version 6/8/2019
 */
#include <string>
#include <iostream>

using namespace std;

#pragma once

template<class T>
class BinarySearchTree;        // forward declaration;

template<class T>
class Node
{
	private:
		/** the data element in the node */
		T data;
		/** Reference to the Node's left child */ 
		Node* left;
		/** Reference to the Node's right child */ 
		Node* right;

		/** Associates Node to Binary Search Tree */
		friend class BinarySearchTree<T>;

	public:
		/** 
		 * This recursive method inserts a new node into the 
		 * tree and resolves its location and parentage
		 * @param node - the node to be inserted
		 */
		void insertNode(Node* node);

		/**
		 * This recursive method searches the tree for a given id 
		 * and returns true if found, false if not.
		 * @param id - the node's id to be found
		 * @return true, if found, false if not
		 */
		bool find(int id);
		
		/** 
		 * This recursive method attempts to retrieve an object 
		 * with the given id from the tree. It returns a reference 
		 * to the node's data, if found or NULL if not.
		 * @param id - the node's id to be found
		 * @return data - reference to the node's data
		 */
		T* get(int id);
		
		/**
		 * This recursive method prints the nodes in ascending
		 * id (key) sequrence. 
		 */
		void printNodes();
		
		/**
		 * This recursive method prints the nodes whose dtudents 
		 * are enrolled in the given major, in ascending id (key) 
		 * sequrence.
		 */
		void printMajor(string major);
};

template<class T>
class BinarySearchTree
{
	private:
		/** the node acting as the root of the tree */
		Node<T>* root;

	public:
		/** BST constructor */
		BinarySearchTree();

		/**
         * This method creates the node to be inserted into
         * the BST and initiates its insertion process.
         * @param data - the data element to be inserted into
         * the node
         */
		void insert(T data);
		
		/**
		 * This method finds the node with the data given and
		 * removes it from the tree and resolves the tree 
		 * after the removal. Does nothing if not found.
		 */
		void erase(T data);
		
		/**
		 * This method searches the tree for a node with the
		 * parameter id. It returns true, if it is found, 
		 * false if it does not appear in the tree.
		 * @param id - the identifier to be found
		 * @return true, if found, false, if not
		 */
		bool find(int id);
		
		/**
		 * This method searches the tree for the node with the 
		 * parameter id. If found, it retrievs the node and
		 * returns a reference to its data; if not found, it 
		 * returns NULL.
		 * @param id - the identifier of the node to be retrieved
		 * @return data - reference to the node's data, if found,
		 * NULL, if not found.
		 */
		T* get(int id);

		/**
		 * This method prints all th nodes in the tree in
		 * asending sequence.
		 */
		void print() const;
		
		/**
		 * This method prints all the nodes where the data contains
		 * the major as specified in the parameter in ascending
		 * order.
		 */
		void print(string major) const;
};

template<class T>
BinarySearchTree<T>::BinarySearchTree()
{
	root = NULL;
}

template<class T>
void BinarySearchTree<T>::print() const
{
	if (root != NULL)
		root->printNodes();
}

template<class T>
void BinarySearchTree<T>::print(string major) const
{
	if (root != NULL)
		return root->printMajor(major);
	return;
}

template<class T>
void BinarySearchTree<T>::insert(T data)
{
	Node<T>* node = new Node<T>;
	node->data = data;
	node->left = NULL;
	node->right = NULL;
	if (root == NULL)
		root = node;
	else
		root->insertNode(node);
}

template<class T>
void Node<T>::insertNode(Node* node)
{
	if (node->data.getIdent() < data.getIdent())
	{
		if (left == NULL)
			left = node;
		else
			left->insertNode(node);
	}
	else if (data.getIdent() < node->data.getIdent())
	{
		if (right == NULL)
			right = node;
		else
			right->insertNode(node);
	}
}

template<class T>
void BinarySearchTree<T>::erase(T data)
{
	// Find node to be removed 
	Node<T>* to_be_removed = root;
	Node<T>* parent = NULL;
	bool found = false;

	while (!found && to_be_removed != NULL)
	{
		if (to_be_removed->data.getIdent() < data.getIdent())
		{
			parent = to_be_removed;
			to_be_removed = to_be_removed->right;
		}
		else if (data.getIdent() < to_be_removed->data.getIdent())
		{
			parent = to_be_removed;
			to_be_removed = to_be_removed->left;
		}
		else
			found = true;
	}

	if (!found)
		return;

	// to_be_removed contains data
	// If one of the children is empty, use the other
	if (to_be_removed->left == NULL || to_be_removed->right == NULL)
	{
		Node<T>* new_child;
		if (to_be_removed->left == NULL)
			new_child = to_be_removed->right;
		else
			new_child = to_be_removed->left;

		if (parent == NULL) // Found in root
			root = new_child;
		else if (parent->left == to_be_removed)
			parent->left = new_child;
		else
			parent->right = new_child;
		return;
	}

	// Neither subtree is empty
	// Find smallest element of the right subtree 
	Node<T>* smallest_parent = to_be_removed;
	Node<T>* smallest = to_be_removed->right;
	while (smallest->left != NULL)
	{
		smallest_parent = smallest;
		smallest = smallest->left;
	}

	// smallest contains smallest child in right subtree
	// Move contents, unlink child
	to_be_removed->data = smallest->data;
	if (smallest_parent == to_be_removed)
		smallest_parent->right = smallest->right;
	else
		smallest_parent->left = smallest->right;
}

template<class T>
bool BinarySearchTree<T>::find(int id)
{
	if (root != NULL)
		return root->find(id);
	return false;
}

template<class T>
bool Node<T>::find(int id)
{
	if (id < this->data.getIdent())
	{
		if (left == NULL)
			return false;
		else
			return left->find(id);
	}
	else if (data.getIdent() < id)
	{
		if (right == NULL)
			return false;
		else
			return right->find(id);
	}
	else
		return true;
}

template<class T>
T* BinarySearchTree<T>::get(int id)
{
	if (root != NULL)
		if (root->find(id))
			return root->get(id);
	return NULL;
}

template<class T>
T* Node<T>::get(int id)
{
	if (id < this->data.getIdent())
	{
		if (left == NULL)
			return NULL;
		else
			return left->get(id);
	}
	else if (data.getIdent() < id)
	{
		if (right == NULL)
			return NULL;
		else
			return right->get(id);
	}
	else
		return &data;
}

template<class T>
void Node<T>::printNodes()
{
	if (left != NULL)
		left->printNodes();
	cout << this->data.toString() << "\n";
	if (right != NULL)
		right->printNodes();
	return;
}

template<class T>
void Node<T>::printMajor(string major)
{
	if (left != NULL)
		left->printMajor(major);
	if (this->data.getMajor() == major)
		cout << this->data.toString() << "\n";
	if (right != NULL)
		right->printMajor(major);
	return;
}

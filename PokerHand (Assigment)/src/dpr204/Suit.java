package dpr204;
/*
 * An enum is much like a class but is used to declare constant
 * objects.  The simplest form is of an enum is a list of objects
 * that behave like primitive constants.
 */

public enum Suit {
/*
 * In some card games the suits are not ordered.  In other games the suits
 * are ordered.  In java enum values are *always* ordered and can be compared
 * using the 'Comparable' interface.
 */
	SPADE,   
	HEART,
	DIAMOND,
	CLUB,
}

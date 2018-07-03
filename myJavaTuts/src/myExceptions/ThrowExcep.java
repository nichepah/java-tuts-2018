package myExceptions;
/*
 * 
ArithmeticException Arithmetic error, such as divide-by-zero.
ArrayIndexOutOfBoundsException Array index is out-of-bounds.
ArrayStoreException Assignment to an array element of an incompatible type.
ClassCastException Invalid cast.
EnumConstantNotPresentException An attempt is made to use an undefined enumeration value.
IllegalArgumentException Illegal argument used to invoke a method.
IllegalMonitorStateException Illegal monitor operation, such as waiting on an unlocked
thread.
IllegalStateException Environment or application is in incorrect state.
IllegalThreadStateException Requested operation not compatible with current thread
state.
IndexOutOfBoundsException Some type of index is out-of-bounds.
NegativeArraySizeException Array created with a negative size.
NullPointerException Invalid use of a null reference.
NumberFormatException Invalid conversion of a string to a numeric format.
SecurityException Attempt to violate security.
StringIndexOutOfBounds Attempt to index outside the bounds of a string.
TypeNotPresentException Type not found.
UnsupportedOperationException An unsupported operation was encountered.
ClassNotFoundException Class not found.
CloneNotSupportedException Attempt to clone an object that does not implement the Cloneable
interface.
IllegalAccessException Access to a class is denied.
InstantiationException Attempt to create an object of an abstract class or interface.
InterruptedException One thread has been interrupted by another thread.
NoSuchFieldException A requested field does not exist.
NoSuchMethodException A requested method does not exist.
 * 
 * 
 */

class ThrowExcep
{
    static void fun()
    {
        try
        {
            throw new NullPointerException("demo");
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught inside fun().");
            // comment and see the effect
            throw e; // re-throwing the exception
        }
    }
 
    public static void main(String args[])
    {
        try
        {
            fun();
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught in main.");
        }
    }
}
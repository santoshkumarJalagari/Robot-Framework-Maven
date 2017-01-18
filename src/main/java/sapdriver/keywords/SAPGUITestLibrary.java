package sapdriver.keywords;


import java.util.Stack;
 
/**
 * This is an example for a Keyword Library for the Robot Framework.
 * @author Santosh kumar J
 */
public class SAPGUITestLibrary {
 
    /** This means the same instance of this class is used throughout
     *  the lifecycle of a Robot Framework test execution.
     */
    public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";    
 
    //</editor-fold>
    /** The Functionality to be tested */
    private Stack<String> testStack;
 
    /**
     * Keyword-method to create an empty stack.
     */
    public void createAnEmptyStack() {
        testStack = new Stack<String>();
        System.out.println("Created Empty Stack Sucessfully");
    }
 
 
    /**
     * Keyword-method to add an element to the stack.
     * @param element The element
     */
    public void addAnElement(String element) {
        testStack.push(element);
        System.out.println("Added "+element+" to the stack");
    }
 
    /**
     * Keyword-method to remove the last element from the stack.
     */
    public void removeLastElement() {
        testStack.pop();
        System.out.println("Removed last element from the stack");
    }
 
    /**
     * Keyword-method to search for an element position.
     * @param element The element
     * @param pos The expected position
     */
    public void elementShouldBeAtPosition(String element, int pos) 
            throws Exception {
        if (testStack.search(element) != pos) {
            throw new Exception("Wrong position: " + testStack.search(element));
        }
    }
 
    /**
     * Keyword-method to check the last element in the stack.
     * @param result Expected resulting element
     */
    public void theLastElementShouldBe(String result) throws Exception {
        String element = testStack.pop();
        if (!result.equals(element)) {
            throw new Exception("Wrong element: " + element);
        }
    }
}
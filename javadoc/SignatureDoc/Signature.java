public class Signature {
    String first, last;
    
    public Signature(String first, String last){
        // construction method, populate object variables
        this.first = first;
        this.last = last;
    }
    public int lengthFirst(){
        // return length of first name
        return first.length();
    }
    public int lengthLast(){
        // return length of last name
        return last.length();
    }
    public String getFirst(){
        // return first name
        return first;
    }
    public String getLast(){
        // return last name
        return last;
    }
    public String getFull(){
        // return full name
        return first + " " + last;
    }    
    public boolean contains(String str){
        // get full name and check if full name contains substring
        String fullName = first + " " + last;
        return fullName.contains(str);
        // return fullname.contains(str);

    }
    private boolean firstContains(String str){
        // check if first name contains substring
        return first.contains(str);
    }
    private boolean lastContains(String str){
        // check if last name contains substring
        return last.contains(str);
    }
    private boolean stringContains(String str, char c){
        // check if string given has char in it, used for checking before replacing
        return str.contains("" + c + "");
        // Character.toString(c)
    }
    public void shortenFirstTo(String str){
        // check if first contains the full string
        // if it exists, get the first index of the string
        // use the first index to create substring out of first name
        // to create substring, use beginning and end indexes of str in first name
        // output error if str is not a substring of the first name
        if(firstContains(str)){
            // int begin = str.indexOf(str);
            // int end = begin + str.length();
            // System.out.println(begin + " " + end);
            first = first.substring(0, str.length());
            System.out.println("Successfully corrected the first name to: " + first);
        }
        else{
            System.out.println("Error: first name does not include the specified characters.");
        }
    }
    public void replaceChar(char wrong, char fix){
        // check both the first and last names if the wrong char is contained in the names
        // if it exists in the first or last name, use String replace method to swap the wrong char with the fix char
        // output the corrected names
        // if the chars do not exist, output error statements for both occurences
        if(stringContains(this.first, wrong)){
            first = first.replace(wrong, fix);
            System.out.println("Successfully corrected the first name to: " + first);
        }
        else{
            System.out.println("Error: first name does not include specified characters");

        }
        if(stringContains(this.last, wrong)){
            last = last.replace(wrong, fix);  
            System.out.println("Successfully corrected the last name to: " + last);
        }
        else{
            System.out.println("Error: last name does not include specified characters");
        }
    }
    public static void main(String[] args){
        //initialize Rectangle object
        Signature name = new Signature("Allan","Bundy");
        System.out.println("Length of first name: " + name.lengthFirst());
        System.out.println("Length of last name: " + name.lengthLast());
        System.out.println("Full name: " + name.getFull());
        
        // full name contains 'Bund'
        System.out.println("Full name contains Bund: " + name.contains("Bund"));
        
        // change first name to Al
        name.shortenFirstTo("Al");
        System.out.println("Full name after shortening: " + name.getFull());
        name.replaceChar('n', 'r');
        System.out.println("Full name after changing letters: " + name.getFull());
        // System.out.println("Halloween".charAt(1));
        // double cost = 9.99;
        // String costStr = Double.toString(cost);
        // System.out.println(costStr);
        // String sentence = "Oh hi" + " " + "Mark";
        // System.out.println(sentence);
        // String str = "0123456789";
        // String sub = str.substring(3);
        // String sub2 = str.substring(3,6);
        // System.out.println(sub + " " + sub2);

    }
    
}
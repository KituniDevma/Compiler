package Scanner;

public class Token {
    private TokenType type;
    private String value;


    public TokenType getType() {
        return type;
      }
    
      public String getValue() {
        return value;
      }
    
      public void setType(TokenType type) {
        this.type = type;
      }
    
      public void setValue(String value) {
        this.value = value;
      }
    
}

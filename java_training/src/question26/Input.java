package question26; 
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
 
/** 
 * パスワード入力クラス 
 */ 
public class Input { 
    /** 
     * パスワードを入力  
     * 
     * @throws IOException 
     * @throws InputPasswordException2502 
     */ 
    public void inputPassword() throws IOException, InputPasswordException { 
        System.out.println("パスワードを入力してください。（4文字以上8文字以内）"); 
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
 
        String password = reader.readLine(); 
 
        // 入力されたパスワードの文字数をチェック 
        
        checkPassword(password); 
 
        System.out.println("パスワードは" + password + "です。"); 
    } 
    
    
    private void checkPassword(String password) throws InputPasswordException { 
        if (password.length() < 4 || 8 < password.length()) { 
            throw new InputPasswordException(); 
        }
        
    }
}
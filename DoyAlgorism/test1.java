package DoyAlgorism;

public class test1 {
	
	public static void main(String[] args){
		String s="tra ahelfi asdfas aaaaaa aaaaaa";
		String answer ="";
        String[] word = s.split("");
        //t,r,y, ,h,e,l,l,o, ,w,o,r,l,d(°ø¹éÆ÷ÇÔ)
        int cnt=0;
        
        for(int i=0;i<word.length;i++){
            if(word[i].equals(" ")){
                cnt=0;
            }else{
                cnt+=1;
            }
            
            if(cnt%2==0){
                word[i] = word[i].replace(word[i],word[i].toLowerCase());
            }else{
                word[i] = word[i].replace(word[i],word[i].toUpperCase());
            }
            answer += word[i];
        }
        System.out.println(answer);
	}

}

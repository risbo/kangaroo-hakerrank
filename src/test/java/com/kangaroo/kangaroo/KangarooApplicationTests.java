package com.kangaroo.kangaroo;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KangarooApplicationTests {

	@Test
	void contextLoads() {
		final String SYNC = "YES";
		assertEquals(SYNC, kangaroo(0,3,4,2));
	}

	public String kangaroo(int x1, int v1, int x2, int v2) {
        boolean completed = false;
        int k1Jump = x1;
        int k2Jump = x2;

		int counter = 0;
		while(!completed){

			for(int i = 0; i < v1 ; i++) {
				k1Jump++;
			}

			for(int i = 0; i < v2 ; i++) {
				k2Jump++;
			}
			
			if(k1Jump == k2Jump){
                completed = true;
				break;
            }
			if(counter ==10000){
				break;
			}
			++counter;
		}
        
        return completed ? "YES" : "NO";

    }
}

/*for(int i = 0; i < 20 ; i++) {
			if(i%v1 == 0) {
				k1Jump += v1; 
			}
            	
			if(i%v2 == 0) {
				k2Jump +=v2; 
			}
            	
			if(k1Jump == k2Jump){
                completed = true;
            }
		 
			counter1 = i;
			counter2 = i;
			System.out.println("k1Jump: "+ k1Jump+ " k2Jump: "+k2Jump);
        } */

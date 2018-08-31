package com.capgemini.day2.testsjava;

public class SentenceCorrection {

	public static String sentenceCorrection(String sentence, String deleteWord, int position) {
		int i;
		String result="";
		String[]words = sentence.split(" +");
		int length = words.length;
		for(i=0;i<length;i++) {
			if(words[i].equals(deleteWord))
			{
				if(i==position-1)
				{
					continue;
				}
				System.out.print(words[i]+" ");
				result+=words[i]+" ";
			}
			else
			{
				System.out.print(words[i]+" ");
				result+=words[i]+" ";
			}
		}
		
		return result;
	}

	}

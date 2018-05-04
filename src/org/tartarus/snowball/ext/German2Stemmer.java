// This file was generated automatically by the Snowball to Java compiler
// http://snowballstem.org/
package org.tartarus.snowball.ext;
import org.tartarus.snowball.*;
/**
 * This class was automatically generated by a Snowball to Java compiler It
 * implements the stemming algorithm defined by a snowball script.
 */
public class German2Stemmer extends SnowballStemmer{
	private static final long serialVersionUID=1L;
	private final static Among a_0[]={
		new Among("",-1,6),
		new Among("ae",0,2),
		new Among("oe",0,3),
		new Among("qu",0,5),
		new Among("ue",0,4),
		new Among("\u00C3\u009F",0,1)
	};
	private final static Among a_1[]={
		new Among("",-1,5),
		new Among("U",0,2),
		new Among("Y",0,1),
		new Among("\u00C3\u00A4",0,3),
		new Among("\u00C3\u00B6",0,4),
		new Among("\u00C3\u00BC",0,2)
	};
	private final static Among a_2[]={
		new Among("e",-1,2),
		new Among("em",-1,1),
		new Among("en",-1,2),
		new Among("ern",-1,1),
		new Among("er",-1,1),
		new Among("s",-1,3),
		new Among("es",5,2)
	};
	private final static Among a_3[]={
		new Among("en",-1,1),
		new Among("er",-1,1),
		new Among("st",-1,2),
		new Among("est",2,1)
	};
	private final static Among a_4[]={
		new Among("ig",-1,1),
		new Among("lich",-1,1)
	};
	private final static Among a_5[]={
		new Among("end",-1,1),
		new Among("ig",-1,2),
		new Among("ung",-1,1),
		new Among("lich",-1,3),
		new Among("isch",-1,2),
		new Among("ik",-1,2),
		new Among("heit",-1,3),
		new Among("keit",-1,4)
	};
	private static final char g_v[]={17,65,16,1,0,0,0,0,0,0,0,0,0,0,0,0,8,0,32,8};
	private static final char g_s_ending[]={117,30,5};
	private static final char g_st_ending[]={117,30,4};
	private int I_x;
	private int I_p2;
	private int I_p1;
	private boolean r_prelude(){
		int among_var;
		// (, line 33
		// test, line 35
		int v_1=cursor;
		// repeat, line 35
		replab0:
		while(true){
			int v_2=cursor;
			lab1:
			do{
				// goto, line 35
				golab2:
				while(true){
					int v_3=cursor;
					lab3:
					do{
						// (, line 35
						if(!(in_grouping(g_v,97,252))){
							break lab3;
						}
						// [, line 36
						bra=cursor;
						// or, line 36
						lab4:
						do{
							int v_4=cursor;
							lab5:
							do{
								// (, line 36
								// literal, line 36
								if(!(eq_s("u"))){
									break lab5;
								}
								// ], line 36
								ket=cursor;
								if(!(in_grouping(g_v,97,252))){
									break lab5;
								}
								// <-, line 36
								slice_from("U");
								break lab4;
							}while(false);
							cursor=v_4;
							// (, line 37
							// literal, line 37
							if(!(eq_s("y"))){
								break lab3;
							}
							// ], line 37
							ket=cursor;
							if(!(in_grouping(g_v,97,252))){
								break lab3;
							}
							// <-, line 37
							slice_from("Y");
						}while(false);
						cursor=v_3;
						break golab2;
					}while(false);
					cursor=v_3;
					if(cursor>=limit){
						break lab1;
					}
					cursor++;
				}
				continue replab0;
			}while(false);
			cursor=v_2;
			break replab0;
		}
		cursor=v_1;
		// repeat, line 40
		replab6:
		while(true){
			int v_5=cursor;
			lab7:
			do{
				// (, line 40
				// [, line 41
				bra=cursor;
				// substring, line 41
				among_var=find_among(a_0);
				if(among_var==0){
					break lab7;
				}
				// ], line 41
				ket=cursor;
				switch(among_var){
					case 0:
						break lab7;
					case 1:
						// (, line 42
						// <-, line 42
						slice_from("ss");
						break;
					case 2:
						// (, line 43
						// <-, line 43
						slice_from("\u00C3\u00A4");
						break;
					case 3:
						// (, line 44
						// <-, line 44
						slice_from("\u00C3\u00B6");
						break;
					case 4:
						// (, line 45
						// <-, line 45
						slice_from("\u00C3\u00BC");
						break;
					case 5: // (, line 46
					// hop, line 46
					{
						int c=cursor+2;
						if(0>c||c>limit){
							break lab7;
						}
						cursor=c;
					}
					break;
					case 6:
						// (, line 47
						// next, line 47
						if(cursor>=limit){
							break lab7;
						}
						cursor++;
						break;
				}
				continue replab6;
			}while(false);
			cursor=v_5;
			break replab6;
		}
		return true;
	}
	private boolean r_mark_regions(){
		// (, line 53
		I_p1=limit;
		I_p2=limit;
		// test, line 58
		int v_1=cursor;
		// (, line 58
		// hop, line 58
		{
			int c=cursor+3;
			if(0>c||c>limit){
				return false;
			}
			cursor=c;
		}
		// setmark x, line 58
		I_x=cursor;
		cursor=v_1;
		// gopast, line 60
		golab0:
		while(true){
			lab1:
			do{
				if(!(in_grouping(g_v,97,252))){
					break lab1;
				}
				break golab0;
			}while(false);
			if(cursor>=limit){
				return false;
			}
			cursor++;
		}
		// gopast, line 60
		golab2:
		while(true){
			lab3:
			do{
				if(!(out_grouping(g_v,97,252))){
					break lab3;
				}
				break golab2;
			}while(false);
			if(cursor>=limit){
				return false;
			}
			cursor++;
		}
		// setmark p1, line 60
		I_p1=cursor;
		// try, line 61
		lab4:
		do{
			// (, line 61
			if(!(I_p1<I_x)){
				break lab4;
			}
			I_p1=I_x;
		}while(false);
		// gopast, line 62
		golab5:
		while(true){
			lab6:
			do{
				if(!(in_grouping(g_v,97,252))){
					break lab6;
				}
				break golab5;
			}while(false);
			if(cursor>=limit){
				return false;
			}
			cursor++;
		}
		// gopast, line 62
		golab7:
		while(true){
			lab8:
			do{
				if(!(out_grouping(g_v,97,252))){
					break lab8;
				}
				break golab7;
			}while(false);
			if(cursor>=limit){
				return false;
			}
			cursor++;
		}
		// setmark p2, line 62
		I_p2=cursor;
		return true;
	}
	private boolean r_postlude(){
		int among_var;
		// repeat, line 66
		replab0:
		while(true){
			int v_1=cursor;
			lab1:
			do{
				// (, line 66
				// [, line 68
				bra=cursor;
				// substring, line 68
				among_var=find_among(a_1);
				if(among_var==0){
					break lab1;
				}
				// ], line 68
				ket=cursor;
				switch(among_var){
					case 0:
						break lab1;
					case 1:
						// (, line 69
						// <-, line 69
						slice_from("y");
						break;
					case 2:
						// (, line 70
						// <-, line 70
						slice_from("u");
						break;
					case 3:
						// (, line 71
						// <-, line 71
						slice_from("a");
						break;
					case 4:
						// (, line 72
						// <-, line 72
						slice_from("o");
						break;
					case 5:
						// (, line 74
						// next, line 74
						if(cursor>=limit){
							break lab1;
						}
						cursor++;
						break;
				}
				continue replab0;
			}while(false);
			cursor=v_1;
			break replab0;
		}
		return true;
	}
	private boolean r_R1(){
		if(!(I_p1<=cursor)){
			return false;
		}
		return true;
	}
	private boolean r_R2(){
		if(!(I_p2<=cursor)){
			return false;
		}
		return true;
	}
	private boolean r_standard_suffix(){
		int among_var;
		// (, line 84
		// do, line 85
		int v_1=limit-cursor;
		lab0:
		do{
			// (, line 85
			// [, line 86
			ket=cursor;
			// substring, line 86
			among_var=find_among_b(a_2);
			if(among_var==0){
				break lab0;
			}
			// ], line 86
			bra=cursor;
			// call R1, line 86
			if(!r_R1()){
				break lab0;
			}
			switch(among_var){
				case 0:
					break lab0;
				case 1:
					// (, line 88
					// delete, line 88
					slice_del();
					break;
				case 2:
					// (, line 91
					// delete, line 91
					slice_del();
					// try, line 92
					int v_2=limit-cursor;
					lab1:
					do{
						// (, line 92
						// [, line 92
						ket=cursor;
						// literal, line 92
						if(!(eq_s_b("s"))){
							cursor=limit-v_2;
							break lab1;
						}
						// ], line 92
						bra=cursor;
						// literal, line 92
						if(!(eq_s_b("nis"))){
							cursor=limit-v_2;
							break lab1;
						}
						// delete, line 92
						slice_del();
					}while(false);
					break;
				case 3:
					// (, line 95
					if(!(in_grouping_b(g_s_ending,98,116))){
						break lab0;
					}
					// delete, line 95
					slice_del();
					break;
			}
		}while(false);
		cursor=limit-v_1;
		// do, line 99
		int v_3=limit-cursor;
		lab2:
		do{
			// (, line 99
			// [, line 100
			ket=cursor;
			// substring, line 100
			among_var=find_among_b(a_3);
			if(among_var==0){
				break lab2;
			}
			// ], line 100
			bra=cursor;
			// call R1, line 100
			if(!r_R1()){
				break lab2;
			}
			switch(among_var){
				case 0:
					break lab2;
				case 1:
					// (, line 102
					// delete, line 102
					slice_del();
					break;
				case 2:
					// (, line 105
					if(!(in_grouping_b(g_st_ending,98,116))){
						break lab2;
					}
					// hop, line 105
					 {
						int c=cursor-3;
						if(limit_backward>c||c>limit){
							break lab2;
						}
						cursor=c;
					}
					// delete, line 105
					slice_del();
					break;
			}
		}while(false);
		cursor=limit-v_3;
		// do, line 109
		int v_4=limit-cursor;
		lab3:
		do{
			// (, line 109
			// [, line 110
			ket=cursor;
			// substring, line 110
			among_var=find_among_b(a_5);
			if(among_var==0){
				break lab3;
			}
			// ], line 110
			bra=cursor;
			// call R2, line 110
			if(!r_R2()){
				break lab3;
			}
			switch(among_var){
				case 0:
					break lab3;
				case 1:
					// (, line 112
					// delete, line 112
					slice_del();
					// try, line 113
					int v_5=limit-cursor;
					lab4:
					do{
						// (, line 113
						// [, line 113
						ket=cursor;
						// literal, line 113
						if(!(eq_s_b("ig"))){
							cursor=limit-v_5;
							break lab4;
						}
						// ], line 113
						bra=cursor;
						// not, line 113
						{
							int v_6=limit-cursor;
							lab5:
							do{
								// literal, line 113
								if(!(eq_s_b("e"))){
									break lab5;
								}
								cursor=limit-v_5;
								break lab4;
							}while(false);
							cursor=limit-v_6;
						}
						// call R2, line 113
						if(!r_R2()){
							cursor=limit-v_5;
							break lab4;
						}
						// delete, line 113
						slice_del();
					}while(false);
					break;
				case 2: // (, line 116
				// not, line 116
				{
					int v_7=limit-cursor;
					lab6:
					do{
						// literal, line 116
						if(!(eq_s_b("e"))){
							break lab6;
						}
						break lab3;
					}while(false);
					cursor=limit-v_7;
				}
				// delete, line 116
				slice_del();
				break;
				case 3:
					// (, line 119
					// delete, line 119
					slice_del();
					// try, line 120
					int v_8=limit-cursor;
					lab7:
					do{
						// (, line 120
						// [, line 121
						ket=cursor;
						// or, line 121
						lab8:
						do{
							int v_9=limit-cursor;
							lab9:
							do{
								// literal, line 121
								if(!(eq_s_b("er"))){
									break lab9;
								}
								break lab8;
							}while(false);
							cursor=limit-v_9;
							// literal, line 121
							if(!(eq_s_b("en"))){
								cursor=limit-v_8;
								break lab7;
							}
						}while(false);
						// ], line 121
						bra=cursor;
						// call R1, line 121
						if(!r_R1()){
							cursor=limit-v_8;
							break lab7;
						}
						// delete, line 121
						slice_del();
					}while(false);
					break;
				case 4:
					// (, line 125
					// delete, line 125
					slice_del();
					// try, line 126
					int v_10=limit-cursor;
					lab10:
					do{
						// (, line 126
						// [, line 127
						ket=cursor;
						// substring, line 127
						among_var=find_among_b(a_4);
						if(among_var==0){
							cursor=limit-v_10;
							break lab10;
						}
						// ], line 127
						bra=cursor;
						// call R2, line 127
						if(!r_R2()){
							cursor=limit-v_10;
							break lab10;
						}
						switch(among_var){
							case 0:
								cursor=limit-v_10;
								break lab10;
							case 1:
								// (, line 129
								// delete, line 129
								slice_del();
								break;
						}
					}while(false);
					break;
			}
		}while(false);
		cursor=limit-v_4;
		return true;
	}
	public boolean stem(){
		// (, line 139
		// do, line 140
		int v_1=cursor;
		lab0:
		do{
			// call prelude, line 140
			if(!r_prelude()){
				break lab0;
			}
		}while(false);
		cursor=v_1;
		// do, line 141
		int v_2=cursor;
		lab1:
		do{
			// call mark_regions, line 141
			if(!r_mark_regions()){
				break lab1;
			}
		}while(false);
		cursor=v_2;
		// backwards, line 142
		limit_backward=cursor;
		cursor=limit;
		// do, line 143
		lab2:
		do{
			// call standard_suffix, line 143
			if(!r_standard_suffix()){
				break lab2;
			}
		}while(false);
		cursor=limit_backward;
		// do, line 144
		int v_4=cursor;
		lab3:
		do{
			// call postlude, line 144
			if(!r_postlude()){
				break lab3;
			}
		}while(false);
		cursor=v_4;
		return true;
	}
	public boolean equals(Object o){
		return o instanceof German2Stemmer;
	}
	public int hashCode(){
		return German2Stemmer.class.getName().hashCode();
	}
}

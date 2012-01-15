package cc.co.majteam.redemption.player.input;

import java.io.Serializable;

public class KeyConfig implements Serializable{

	private static final long serialVersionUID = 1L;
	private int[] keys;
	
	public KeyConfig( int[] keys ){
		this.keys = keys;
	}
	
	public int getKey( Input key ){
		return keys[ key.ordinal() ];
	}
	
	public void setKey( Input key, int chosenKey ){
		keys[ key.ordinal() ] = chosenKey;
	}
}

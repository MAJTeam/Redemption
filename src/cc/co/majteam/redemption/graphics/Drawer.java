package cc.co.majteam.redemption.graphics;


public interface Drawer {
	void init();
	void draw(Drawable drawable, Coords origin);
	void commit();
}

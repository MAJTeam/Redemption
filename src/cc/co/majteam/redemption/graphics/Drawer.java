package cc.co.majteam.redemption.graphics;

import java.util.Set;


public interface Drawer {
	void init();
	void draw(Drawable drawable, Coords origin);
	void draw(Set<Drawable> drawables, Coords origin);
	void commit();
}

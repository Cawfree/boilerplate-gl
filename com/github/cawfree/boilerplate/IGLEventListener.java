package com.github.cawfree.boilerplate;

import com.github.cawfree.boilerplate.IGL;

public interface IGLEventListener<T extends IGL> {
	/* Here we provide accessors to the conventional OpenGL events but provide access to the abstract boilerplate API. */
	public void init(final T pGL);
	public void reshape(final T pGL, final int pX, final int pY, final int pWidth, final int pHeight);
	public void display(final T pGL);
	public void dispose(final T pGL);
}

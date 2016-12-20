package com.github.cawfree.boilerplate.desktop;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

import javax.media.opengl.GL2ES3;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;

import com.github.cawfree.boilerplate.IGLES30;

public class DesktopGLES30 implements GLEventListener, IGLES30 {
	
	/* Member Variables. */
	private GL2ES3 mGL2ES3 = null;
	
	@Override
	public void display(final GLAutoDrawable pGLAutoDrawable) {
		/* Update the GL2ES2 context. */
		this.mGL2ES3 = pGLAutoDrawable.getGL().getGL2ES3();
	}

	@Override
	public void dispose(final GLAutoDrawable pGLAutoDrawable) {
		/* Update the GL2ES2 context. */
		this.mGL2ES3 = pGLAutoDrawable.getGL().getGL2ES3();
	}

	@Override
	public void init(final GLAutoDrawable pGLAutoDrawable) {
		/* Update the GL2ES2 context. */
		this.mGL2ES3 = pGLAutoDrawable.getGL().getGL2ES3();
	}

	@Override
	public void reshape(final GLAutoDrawable pGLAutoDrawable, final int pX, final int pY, final int pWidth, final int pHeight) {
		/* Update the GL2ES2 context. */
		this.mGL2ES3 = pGLAutoDrawable.getGL().getGL2ES3();
	}
	
	@Override
	public final void glActiveTexture(final int arg0) {
		this.getGL2ES3().glActiveTexture(arg0);
	}

	@Override
	public final void glBindBuffer(final int arg0, final int arg1) {
		this.getGL2ES3().glBindBuffer(arg0, arg1);
	}

	@Override
	public final void glBindFramebuffer(final int arg0, final int arg1) {
		this.getGL2ES3().glBindFramebuffer(arg0, arg1);
	}

	@Override
	public final void glBindRenderbuffer(final int arg0, final int arg1) {
		this.getGL2ES3().glBindRenderbuffer(arg0, arg1);
	}

	@Override
	public final void glBindTexture(final int arg0, final int arg1) {
		this.getGL2ES3().glBindTexture(arg0, arg1);
	}

	@Override
	public final void glBlendEquation(final int arg0) {
		this.getGL2ES3().glBlendEquation(arg0);
	}

	@Override
	public final void glBlendEquationSeparate(final int arg0, final int arg1) {
		this.getGL2ES3().glBlendEquationSeparate(arg0, arg1);
	}

	@Override
	public final void glBlendFunc(final int arg0, final int arg1) {
		this.getGL2ES3().glBlendFunc(arg0, arg1);
	}

	@Override
	public final void glBlendFuncSeparate(final int arg0, final int arg1, final int arg2, final int arg3) {
		this.getGL2ES3().glBlendFuncSeparate(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glBufferData(final int arg0, final int arg1, final Buffer arg2, final int arg3) {
		this.getGL2ES3().glBufferData(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glBufferSubData(final int arg0, final int arg1, final int arg2, final Buffer arg3) {
		this.getGL2ES3().glBufferSubData(arg0, arg1, arg2, arg3);
	}

	@Override
	public final int glCheckFramebufferStatus(final int arg0) {
		return this.getGL2ES3().glCheckFramebufferStatus(arg0);
	}

	@Override
	public final void glClear(final int arg0) {
		this.getGL2ES3().glClear(arg0);
	}

	@Override
	public final void glClearColor(final float arg0, final float arg1, final float arg2, final float arg3) {
		this.getGL2ES3().glClearColor(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glClearDepthf(final float arg0) {
		this.glClearDepthf(arg0);
	}

	@Override
	public final void glClearStencil(final int arg0) {
		this.getGL2ES3().glClearStencil(arg0);
	}

	@Override
	public final void glColorMask(final boolean arg0, final boolean arg1, final boolean arg2, boolean arg3) {
		this.getGL2ES3().glColorMask(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glCompressedTexImage2D(final int arg0, final int arg1, final int arg2, final int arg3, final int arg4, final int arg5, final int arg6, final Buffer arg7) {
		this.getGL2ES3().glCompressedTexImage2D(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@Override
	public final void glCompressedTexSubImage2D(final int arg0, final int arg1, final int arg2, final int arg3, final int arg4, final int arg5, final int arg6, final int arg7, final Buffer arg8) {
		this.getGL2ES3().glCompressedTexSubImage2D(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@Override
	public final void glCopyTexImage2D(final int arg0, final int arg1, final int arg2, final int arg3, final int arg4, final int arg5, final int arg6, final int arg7) {
		this.getGL2ES3().glCopyTexImage2D(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@Override
	public final void glCopyTexSubImage2D(final int arg0, final int arg1, final int arg2, final int arg3, final int arg4, final int arg5, final int arg6, final int arg7) {
		this.getGL2ES3().glCopyTexSubImage2D(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@Override
	public final void glCullFace(final int arg0) {
		this.getGL2ES3().glCullFace(arg0);
	}

	@Override
	public final void glDeleteBuffers(final int arg0, final IntBuffer arg1) {
		this.getGL2ES3().glDeleteBuffers(arg0, arg1);
	}

	@Override
	public final void glDeleteBuffers(final int arg0, final int[] arg1, final int arg2) {
		this.getGL2ES3().glDeleteBuffers(arg0, arg1, arg2);
	}

	@Override
	public final void glDeleteFramebuffers(final int arg0, final IntBuffer arg1) {
		this.getGL2ES3().glDeleteFramebuffers(arg0, arg1);
	}

	@Override
	public final void glDeleteFramebuffers(final int arg0, final int[] arg1, final int arg2) {
		this.getGL2ES3().glDeleteFramebuffers(arg0, arg1, arg2);
	}

	@Override
	public final void glDeleteRenderbuffers(final int arg0, final IntBuffer arg1) {
		this.getGL2ES3().glDeleteRenderbuffers(arg0, arg1);
	}

	@Override
	public final void glDeleteRenderbuffers(final int arg0, final int[] arg1, final int arg2) {
		this.getGL2ES3().glDeleteRenderbuffers(arg0, arg1, arg2);
	}

	@Override
	public final void glDeleteTextures(final int arg0, final IntBuffer arg1) {
		this.getGL2ES3().glDeleteTextures(arg0, arg1);
	}

	@Override
	public final void glDeleteTextures(final int arg0, final int[] arg1, final int arg2) {
		this.getGL2ES3().glDeleteTextures(arg0, arg1, arg2);
	}

	@Override
	public final void glDepthFunc(final int arg0) {
		this.getGL2ES3().glDepthFunc(arg0);
	}

	@Override
	public final void glDepthMask(final boolean arg0) {
		this.getGL2ES3().glDepthMask(arg0);
	}

	@Override
	public final void glDepthRangef(final float arg0, final float arg1) {
		this.getGL2ES3().glDepthRangef(arg0, arg1);
	}

	@Override
	public final void glDisable(final int arg0) {
		this.getGL2ES3().glDisable(arg0);
	}

	@Override
	public final void glDrawArrays(final int arg0, final int arg1, final int arg2) {
		this.getGL2ES3().glDrawArrays(arg0, arg1, arg2);
	}

	@Override
	public final void glDrawElements(final int arg0, final int arg1, final int arg2, final int arg3) {
		this.getGL2ES3().glDrawElements(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glEnable(final int arg0) {
		this.getGL2ES3().glEnable(arg0);
	}

	@Override
	public final void glFinish() {
		this.getGL2ES3().glFinish();
	}

	@Override
	public final void glFlush() {
		this.getGL2ES3().glFlush();
	}

	@Override
	public final void glFramebufferRenderbuffer(final int arg0, final int arg1, final int arg2, final int arg3) {
		this.getGL2ES3().glFramebufferRenderbuffer(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glFramebufferTexture2D(final int arg0, final int arg1, final int arg2, final int arg3, final int arg4) {
		this.getGL2ES3().glFramebufferTexture2D(arg0, arg1, arg2, arg3, arg4);
	}

	@Override
	public final void glFrontFace(final int arg0) {
		this.getGL2ES3().glFrontFace(arg0);
	}

	@Override
	public final void glGenBuffers(final int arg0, final IntBuffer arg1) {
		this.getGL2ES3().glGenBuffers(arg0, arg1);
	}

	@Override
	public final void glGenBuffers(final int arg0, final int[] arg1, final int arg2) {
		this.getGL2ES3().glGenBuffers(arg0, arg1, arg2);
	}

	@Override
	public final void glGenFramebuffers(final int arg0, final IntBuffer arg1) {
		this.getGL2ES3().glGenFramebuffers(arg0, arg1);
	}

	@Override
	public final void glGenFramebuffers(final int arg0, final int[] arg1, final int arg2) {
		this.getGL2ES3().glGenFramebuffers(arg0, arg1, arg2);
	}

	@Override
	public final void glGenRenderbuffers(final int arg0, final IntBuffer arg1) {
		this.getGL2ES3().glGenBuffers(arg0, arg1);
	}

	@Override
	public final void glGenRenderbuffers(final int arg0, final int[] arg1, final int arg2) {
		this.getGL2ES3().glGenRenderbuffers(arg0, arg1, arg2);
	}

	@Override
	public final void glGenTextures(final int arg0, final IntBuffer arg1) {
		this.getGL2ES3().glGenTextures(arg0, arg1);
	}

	@Override
	public final void glGenTextures(final int arg0, final int[] arg1, final int arg2) {
		this.getGL2ES3().glGenTextures(arg0, arg1, arg2);
	}

	@Override
	public final void glGenerateMipmap(final int arg0) {
		this.getGL2ES3().glGenerateMipmap(arg0);
	}

	@Override
	public final void glGetBufferParameteriv(final int arg0, final int arg1, final IntBuffer arg2) {
		this.getGL2ES3().glGetBufferParameteriv(arg0, arg1, arg2);
	}

	@Override
	public final void glGetBufferParameteriv(final int arg0, final int arg1, final int[] arg2, final int arg3) {
		this.getGL2ES3().glGetBufferParameteriv(arg0, arg1, arg2, arg3);
	}

	@Override
	public final int glGetError() {
		return this.getGL2ES3().glGetError();
	}

	@Override
	public final void glGetFloatv(final int arg0, final FloatBuffer arg1) {
		this.getGL2ES3().glGetFloatv(arg0, arg1);
	}

	@Override
	public final void glGetFloatv(final int arg0, final float[] arg1, final int arg2) {
		this.getGL2ES3().glGetFloatv(arg0, arg1, arg2);
	}

	@Override
	public final void glGetFramebufferAttachmentParameteriv(final int arg0, final int arg1, final int arg2, final IntBuffer arg3) {
		this.getGL2ES3().glGetFramebufferAttachmentParameteriv(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glGetFramebufferAttachmentParameteriv(final int arg0, final int arg1, final int arg2, final int[] arg3, final int arg4) {
		this.getGL2ES3().glGetFramebufferAttachmentParameteriv(arg0, arg1, arg2, arg3, arg4);
	}

	@Override
	public final void glGetIntegerv(final int arg0, final IntBuffer arg1) {
		this.getGL2ES3().glGetIntegerv(arg0, arg1);
	}

	@Override
	public final void glGetIntegerv(final int arg0, final int[] arg1, final int arg2) {
		this.getGL2ES3().glGetIntegerv(arg0, arg1, arg2);
	}

	@Override
	public final void glGetRenderbufferParameteriv(final int arg0, final int arg1, final IntBuffer arg2) {
		this.getGL2ES3().glGetRenderbufferParameteriv(arg0, arg1, arg2);
	}

	@Override
	public final void glGetRenderbufferParameteriv(final int arg0, final int arg1, final int[] arg2, final int arg3) {
		this.getGL2ES3().glGetRenderbufferParameteriv(arg0, arg1, arg2, arg3);
	}

	@Override
	public final String glGetString(final int arg0) {
		return this.getGL2ES3().glGetString(arg0);
	}

	@Override
	public final void glGetTexParameterfv(final int arg0, final int arg1, final FloatBuffer arg2) {
		this.getGL2ES3().glGetTexParameterfv(arg0, arg1, arg2);
	}

	@Override
	public final void glGetTexParameterfv(final int arg0, final int arg1, final float[] arg2, final int arg3) {
		this.getGL2ES3().glGetTexParameterfv(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glGetTexParameteriv(final int arg0, final int arg1, final IntBuffer arg2) {
		this.getGL2ES3().glGetTexParameteriv(arg0, arg1, arg2);
	}

	@Override
	public final void glGetTexParameteriv(final int arg0, final int arg1, final int[] arg2, final int arg3) {
		this.getGL2ES3().glGetTexParameteriv(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glHint(final int arg0, final int arg1) {
		this.getGL2ES3().glHint(arg0, arg1);
	}

	@Override
	public final boolean glIsBuffer(final int arg0) {
		return this.getGL2ES3().glIsBuffer(arg0);
	}

	@Override
	public final boolean glIsEnabled(final int arg0) {
		return this.getGL2ES3().glIsEnabled(arg0);
	}

	@Override
	public final boolean glIsFramebuffer(final int arg0) {
		return this.getGL2ES3().glIsFramebuffer(arg0);
	}

	@Override
	public final boolean glIsRenderbuffer(final int arg0) {
		return this.getGL2ES3().glIsRenderbuffer(arg0);
	}

	@Override
	public final boolean glIsTexture(final int arg0) {
		return this.getGL2ES3().glIsTexture(arg0);
	}

	@Override
	public final void glLineWidth(final float arg0) {
		this.getGL2ES3().glLineWidth(arg0);
	}

	@Override
	public final void glPixelStorei(final int arg0, final int arg1) {
		this.getGL2ES3().glPixelStorei(arg0, arg1);
	}

	@Override
	public final void glPolygonOffset(final float arg0, final float arg1) {
		this.getGL2ES3().glPolygonOffset(arg0, arg1);
	}

	@Override
	public final void glReadPixels(final int arg0, final int arg1, final int arg2, final int arg3, final int arg4, final int arg5, final Buffer arg6) {
		this.getGL2ES3().glReadPixels(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@Override
	public final void glRenderbufferStorage(final int arg0, final int arg1, final int arg2, final int arg3) {
		this.getGL2ES3().glRenderbufferStorage(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glSampleCoverage(final float arg0, final boolean arg1) {
		this.getGL2ES3().glSampleCoverage(arg0, arg1);
	}

	@Override
	public final void glScissor(final int arg0, final int arg1, final int arg2, final int arg3) {
		this.getGL2ES3().glScissor(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glStencilFunc(final int arg0, final int arg1, final int arg2) {
		this.getGL2ES3().glStencilFunc(arg0, arg1, arg2);
	}

	@Override
	public final void glStencilMask(final int arg0) {
		this.getGL2ES3().glStencilMask(arg0);
	}

	@Override
	public final void glStencilOp(final int arg0, final int arg1, final int arg2) {
		this.getGL2ES3().glStencilOp(arg0, arg1, arg2);
	}

	@Override
	public final void glTexImage2D(final int arg0, final int arg1, final int arg2, final int arg3, final int arg4, final int arg5, final int arg6, final int arg7, final Buffer arg8) {
		this.getGL2ES3().glTexImage2D(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@Override
	public final void glTexParameterf(final int arg0, final int arg1, final float arg2) {
		this.getGL2ES3().glTexParameterf(arg0, arg1, arg2);
	}

	@Override
	public final void glTexParameterfv(final int arg0, final int arg1, final FloatBuffer arg2) {
		this.getGL2ES3().glTexParameterfv(arg0, arg1, arg2);
	}

	@Override
	public final void glTexParameterfv(final int arg0, final int arg1, final float[] arg2, final int arg3) {
		this.getGL2ES3().glTexParameterfv(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glTexParameteri(final int arg0, final int arg1, final int arg2) {
		this.getGL2ES3().glTexParameteri(arg0, arg1, arg2);
	}

	@Override
	public final void glTexParameteriv(final int arg0, final int arg1, final IntBuffer arg2) {
		this.getGL2ES3().glTexParameteriv(arg0, arg1, arg2);
	}

	@Override
	public final void glTexParameteriv(final int arg0, final int arg1, final int[] arg2, final int arg3) {
		this.getGL2ES3().glTexParameteriv(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glTexSubImage2D(final int arg0, final int arg1, final int arg2, final int arg3, final int arg4, final int arg5, final int arg6, final int arg7, final Buffer arg8) {
		this.getGL2ES3().glTexSubImage2D(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@Override
	public final void glViewport(final int arg0, final int arg1, final int arg2, final int arg3) {
		this.getGL2ES3().glViewport(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glAttachShader(final int arg0, final int arg1) {
		this.getGL2ES3().glAttachShader(arg0, arg1);
	}

	@Override
	public final void glBindAttribLocation(final int arg0, final int arg1, final String arg2) {
		this.getGL2ES3().glBindAttribLocation(arg0, arg1, arg2);
	}

	@Override
	public final void glBlendColor(final float arg0, final float arg1, final float arg2, final float arg3) {
		this.getGL2ES3().glBlendColor(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glCompileShader(final int arg0) {
		this.getGL2ES3().glCompileShader(arg0);
	}

	@Override
	public final int glCreateProgram() {
		return this.getGL2ES3().glCreateProgram();
	}

	@Override
	public final int glCreateShader(final int arg0) {
		return this.getGL2ES3().glCreateShader(arg0);
	}

	@Override
	public final void glDeleteProgram(final int arg0) {
		this.getGL2ES3().glDeleteProgram(arg0);
	}

	@Override
	public final void glDeleteShader(final int arg0) {
		this.getGL2ES3().glDeleteShader(arg0);
	}

	@Override
	public final void glDetachShader(final int arg0, final int arg1) {
		this.getGL2ES3().glDetachShader(arg0, arg1);
	}

	@Override
	public final void glDisableVertexAttribArray(final int arg0) {
		this.getGL2ES3().glDisableVertexAttribArray(arg0);
	}

	@Override
	public final void glEnableVertexAttribArray(final int arg0) {
		this.getGL2ES3().glEnableVertexAttribArray(arg0);
	}

	@Override
	public final void glGetActiveAttrib(final int arg0, final int arg1, final int arg2, final int[] arg3, final int arg4, final int[] arg5, final int arg6, final int[] arg7, final int arg8, final byte[] arg9, final int arg10) {
		this.getGL2ES3().glGetActiveAttrib(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
	}

	@Override
	public final void glGetActiveUniform(final int arg0, final int arg1, final int arg2, final int[] arg3, final int arg4, final int[] arg5, final int arg6, final int[] arg7, final int arg8, final byte[] arg9, final int arg10) {
		this.getGL2ES3().glGetActiveUniform(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
	}

	@Override
	public final void glGetAttachedShaders(final int arg0, final int arg1, final IntBuffer arg2, final IntBuffer arg3) {
		this.getGL2ES3().glGetAttachedShaders(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glGetAttachedShaders(final int arg0, final int arg1, final int[] arg2, final int arg3, final int[] arg4, final int arg5) {
		this.getGL2ES3().glGetAttachedShaders(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@Override
	public final int glGetAttribLocation(final int arg0, final String arg1) {
		return this.getGL2ES3().glGetAttribLocation(arg0, arg1);
	}

	@Override
	public final void glGetProgramiv(final int arg0, final int arg1, final IntBuffer arg2) {
		this.getGL2ES3().glGetProgramiv(arg0, arg1, arg2);
	}

	@Override
	public final void glGetProgramiv(final int arg0, final int arg1, final int[] arg2, final int arg3) {
		this.getGL2ES3().glGetProgramiv(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glGetShaderSource(final int arg0, final int arg1, final int[] arg2, final int arg3, final byte[] arg4, final int arg5) {
		this.getGL2ES3().glGetShaderSource(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@Override
	public final void glGetShaderiv(final int arg0, final int arg1, final IntBuffer arg2) {
		this.getGL2ES3().glGetShaderiv(arg0, arg1, arg2);
	}

	@Override
	public final void glGetShaderiv(final int arg0, final int arg1, final int[] arg2, final int arg3) {
		this.getGL2ES3().glGetShaderiv(arg0, arg1, arg2, arg3);
	}

	@Override
	public final int glGetUniformLocation(final int arg0, final String arg1) {
		return this.getGL2ES3().glGetUniformLocation(arg0, arg1);
	}

	@Override
	public final void glGetUniformfv(final int arg0, final int arg1, final FloatBuffer arg2) {
		this.getGL2ES3().glGetUniformfv(arg0, arg1, arg2);
	}

	@Override
	public final void glGetUniformfv(final int arg0, final int arg1, final float[] arg2, final int arg3) {
		this.getGL2ES3().glGetUniformfv(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glGetUniformiv(final int arg0, final int arg1, final IntBuffer arg2) {
		this.getGL2ES3().glGetUniformiv(arg0, arg1, arg2);
	}

	@Override
	public final void glGetUniformiv(final int arg0, final int arg1, final int[] arg2, final int arg3) {
		this.getGL2ES3().glGetUniformiv(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glGetVertexAttribfv(final int arg0, final int arg1, final FloatBuffer arg2) {
		this.getGL2ES3().glGetVertexAttribfv(arg0, arg1, arg2);
	}

	@Override
	public final void glGetVertexAttribfv(final int arg0, final int arg1, final float[] arg2, final int arg3) {
		this.getGL2ES3().glGetVertexAttribfv(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glGetVertexAttribiv(final int arg0, final int arg1, final IntBuffer arg2) {
		this.getGL2ES3().glGetVertexAttribiv(arg0, arg1, arg2);
	}

	@Override
	public final void glGetVertexAttribiv(final int arg0, final int arg1, final int[] arg2, final int arg3) {
		this.getGL2ES3().glGetVertexAttribiv(arg0, arg1, arg2, arg3);
	}

	@Override
	public final boolean glIsProgram(final int arg0) {
		return this.getGL2ES3().glIsProgram(arg0);
	}

	@Override
	public final boolean glIsShader(final int arg0) {
		return this.getGL2ES3().glIsShader(arg0);
	}

	@Override
	public final void glLinkProgram(final int arg0) {
		this.getGL2ES3().glLinkProgram(arg0);
	}
	
	/** TODO: Reuse the allocated String Array? **/
	@Override
	public final void glShaderSource(final int arg0, final String arg2) {
		this.getGL2ES3().glShaderSource(arg0, 1, new String[]{arg2}, null);
	}

	@Override
	public final void glStencilFuncSeparate(final int arg0, final int arg1, final int arg2, final int arg3) {
		this.getGL2ES3().glStencilFuncSeparate(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glStencilMaskSeparate(final int arg0, final int arg1) {
		this.getGL2ES3().glStencilMaskSeparate(arg0, arg1);
	}

	@Override
	public final void glStencilOpSeparate(final int arg0, final int arg1, final int arg2, final int arg3) {
		this.getGL2ES3().glStencilOpSeparate(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glUniform1f(final int arg0, final float arg1) {
		this.getGL2ES3().glUniform1f(arg0, arg1);
	}

	@Override
	public final void glUniform1fv(final int arg0, final int arg1, final FloatBuffer arg2) {
		this.getGL2ES3().glUniform1fv(arg0, arg1, arg2);
	}

	@Override
	public final void glUniform1fv(final int arg0, final int arg1, final float[] arg2, final int arg3) {
		this.getGL2ES3().glUniform1fv(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glUniform1i(final int arg0, final int arg1) {
		this.getGL2ES3().glUniform1i(arg0, arg1);
	}

	@Override
	public final void glUniform1iv(final int arg0, final int arg1, final IntBuffer arg2) {
		this.getGL2ES3().glUniform1iv(arg0, arg1, arg2);
	}

	@Override
	public final void glUniform1iv(final int arg0, final int arg1, final int[] arg2, final int arg3) {
		this.getGL2ES3().glUniform1iv(arg0, arg1, arg2, arg3);
	}

	@Override
	public void glUniform2i(int arg0, int arg1, int arg2) {
		this.getGL2ES3().glUniform2i(arg0, arg1, arg2);
	}

	@Override
	public final void glUniform2f(final int arg0, final float arg1, final float arg2) {
		this.getGL2ES3().glUniform2f(arg0, arg1, arg2);
	}

	@Override
	public final void glUniform2fv(final int arg0, final int arg1, final FloatBuffer arg2) {
		this.getGL2ES3().glUniform2fv(arg0, arg1, arg2);
	}

	@Override
	public final void glUniform2fv(final int arg0, final int arg1, final float[] arg2, final int arg3) {
		this.getGL2ES3().glUniform2fv(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glUniform3fv(final int arg0, final int arg1, final FloatBuffer arg2) {
		this.getGL2ES3().glUniform3fv(arg0, arg1, arg2);
	}

	@Override
	public final void glUniform3fv(final int arg0, final int arg1, final float[] arg2, final int arg3) {
		this.getGL2ES3().glUniform3fv(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glUniform3i(final int arg0, final int arg1, final int arg2, final int arg3) {
		this.getGL2ES3().glUniform3i(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glUniform3iv(final int arg0, final int arg1, final IntBuffer arg2) {
		this.getGL2ES3().glUniform3iv(arg0, arg1, arg2);
	}

	@Override
	public final void glUniform3iv(final int arg0, final int arg1, final int[] arg2, final int arg3) {
		this.getGL2ES3().glUniform3iv(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glUniform4f(final int arg0, final float arg1, final float arg2, final float arg3, final float arg4) {
		this.getGL2ES3().glUniform4f(arg0, arg1, arg2, arg3, arg4);
	}

	@Override
	public final void glUniform4fv(final int arg0, final int arg1, final FloatBuffer arg2) {
		this.getGL2ES3().glUniform4fv(arg0, arg1, arg2);
	}

	@Override
	public final void glUniform4fv(final int arg0, final int arg1, final float[] arg2, final int arg3) {
		this.getGL2ES3().glUniform4fv(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glUniform4i(final int arg0, final int arg1, final int arg2, final int arg3, final int arg4) {
		this.getGL2ES3().glUniform4i(arg0, arg1, arg2, arg3, arg4);
	}

	@Override
	public final void glUniform4iv(final int arg0, final int arg1, final IntBuffer arg2) {
		this.getGL2ES3().glUniform4iv(arg0, arg1, arg2);
	}

	@Override
	public final void glUniform4iv(final int arg0, final int arg1, final int[] arg2, final int arg3) {
		this.getGL2ES3().glUniform4iv(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glUniformMatrix2fv(final int arg0, final int arg1, final boolean arg2, final FloatBuffer arg3) {
		this.getGL2ES3().glUniformMatrix2fv(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glUniformMatrix2fv(final int arg0, final int arg1, final boolean arg2, final float[] arg3, final int arg4) {
		this.getGL2ES3().glUniformMatrix2fv(arg0, arg1, arg2, arg3, arg4);
	}

	@Override
	public final void glUniformMatrix3fv(final int arg0, final int arg1, final boolean arg2, final FloatBuffer arg3) {
		this.getGL2ES3().glUniformMatrix3fv(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glUniformMatrix3fv(final int arg0, final int arg1, final boolean arg2, final float[] arg3, final int arg4) {
		this.getGL2ES3().glUniformMatrix3fv(arg0, arg1, arg2, arg3, arg4);
	}

	@Override
	public final void glUniformMatrix4fv(final int arg0, final int arg1, final boolean arg2, final FloatBuffer arg3) {
		this.getGL2ES3().glUniformMatrix4fv(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glUniformMatrix4fv(final int arg0, final int arg1, final boolean arg2, final float[] arg3, final int arg4) {
		this.getGL2ES3().glUniformMatrix4fv(arg0, arg1, arg2, arg3, arg4);
	}

	@Override
	public final void glUseProgram(final int arg0) {
		this.getGL2ES3().glUseProgram(arg0);
	}

	@Override
	public final void glValidateProgram(final int arg0) {
		this.getGL2ES3().glValidateProgram(arg0);
	}

	@Override
	public final void glVertexAttrib1f(final int arg0, final float arg1) {
		this.getGL2ES3().glVertexAttrib1f(arg0, arg1);
	}

	@Override
	public final void glVertexAttrib1fv(final int arg0, final FloatBuffer arg1) {
		this.getGL2ES3().glVertexAttrib1fv(arg0, arg1);
	}

	@Override
	public final void glVertexAttrib1fv(final int arg0, final float[] arg1, final int arg2) {
		this.getGL2ES3().glVertexAttrib1fv(arg0, arg1, arg2);
	}

	@Override
	public final void glVertexAttrib2f(final int arg0, final float arg1, final float arg2) {
		this.getGL2ES3().glVertexAttrib2f(arg0, arg1, arg2);
	}

	@Override
	public final void glVertexAttrib2fv(final int arg0, final FloatBuffer arg1) {
		this.getGL2ES3().glVertexAttrib2fv(arg0, arg1);
	}

	@Override
	public final void glVertexAttrib2fv(final int arg0, final float[] arg1, final int arg2) {
		this.getGL2ES3().glVertexAttrib2fv(arg0, arg1, arg2);
	}

	@Override
	public final void glVertexAttrib3f(final int arg0, final float arg1, final float arg2, final float arg3) {
		this.getGL2ES3().glVertexAttrib3f(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glVertexAttrib3fv(final int arg0, final FloatBuffer arg1) {
		this.getGL2ES3().glVertexAttrib3fv(arg0, arg1);
	}

	@Override
	public final void glVertexAttrib3fv(final int arg0, final float[] arg1, final int arg2) {
		this.getGL2ES3().glVertexAttrib3fv(arg0, arg1, arg2);
	}

	@Override
	public final void glVertexAttrib4f(final int arg0, final float arg1, final float arg2, final float arg3, final float arg4) {
		this.getGL2ES3().glVertexAttrib4f(arg0, arg1, arg2, arg3, arg4);
	}

	@Override
	public final void glVertexAttrib4fv(final int arg0, final FloatBuffer arg1) {
		this.getGL2ES3().glVertexAttrib4fv(arg0, arg1);
	}

	@Override
	public final void glVertexAttrib4fv(final int arg0, final float[] arg1, final int arg2) {
		this.getGL2ES3().glVertexAttrib4fv(arg0, arg1, arg2);
	}

	@Override
	public final void glVertexAttribPointer(final int arg0, final int arg1, final int arg2, final boolean arg3, final int arg4, final int arg5) {
		this.getGL2ES3().glVertexAttribPointer(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@Override
	public final void glReleaseShaderCompiler() {
		this.getGL2ES3().glReleaseShaderCompiler();
	}

	@Override
	public final void glShaderBinary(final int arg0, final IntBuffer arg1, final int arg2, final Buffer arg3, final int arg4) {
		this.getGL2ES3().glShaderBinary(arg0, arg1, arg2, arg3, arg4);
	}

	@Override
	public final void glShaderBinary(final int arg0, final int[] arg1, final int arg2, final int arg3, final Buffer arg4, final int arg5) {
		this.getGL2ES3().glShaderBinary(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@Override
	public final void glGetShaderPrecisionFormat(final int arg0, final int arg1, final IntBuffer arg2, final IntBuffer arg3) {
		this.getGL2ES3().glGetShaderPrecisionFormat(arg0, arg1, arg2, arg3);
	}

	@Override
	public final void glGetShaderPrecisionFormat(final int arg0, final int arg1, final int[] arg2, final int arg3, final int[] arg4, final int arg5) {
		this.getGL2ES3().glGetShaderPrecisionFormat(arg0, arg1, arg2, arg3, arg4, arg5);
	}
	
	private final GL2ES3 getGL2ES3() {
		return this.mGL2ES3;
	}

	@Override
	public final void glBeginTransformFeedback(final int primitiveMode) {
		this.getGL2ES3().glBeginTransformFeedback(primitiveMode);
	}

	@Override
	public final void glBindBufferBase(final int target, final int index, final int buffer) {
		this.getGL2ES3().glBindBufferBase(target, index, buffer);
	}

	@Override
	public final void glBindBufferRange(final int target, final int index, final int buffer, final long offset, final long size) {
		this.getGL2ES3().glBindBufferRange(target, index, buffer, offset, size);
	}

	@Override
	public final void glBindVertexArray(final int array) {
		this.getGL2ES3().glBindVertexArray(array);
	}

	@Override
	public final void glBlitFramebuffer(final int srcX0, final int srcY0, final int srcX1, final int srcY1, final int dstX0, final int dstY0, final int dstX1, final int dstY1, final int mask, final int filter) {
		this.getGL2ES3().glBlitFramebuffer(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
	}

	@Override
	public final void glClearBufferfi(final int buffer, final int drawbuffer, final float depth, final int stencil) {
		this.getGL2ES3().glClearBufferfi(buffer, drawbuffer, depth, stencil);
	}

	@Override
	public final void glClearBufferfv(final int buffer, final int drawbuffer, final float[] value, final int value_offset) {
		this.getGL2ES3().glClearBufferfv(buffer, drawbuffer, value, value_offset);
	}

	@Override
	public final void glClearBufferiv(final int buffer, final int drawbuffer, final int[] value, final int value_offset) {
		this.getGL2ES3().glClearBufferiv(buffer, drawbuffer, value, value_offset);
	}

	@Override
	public final void glClearBufferuiv(final int buffer, final int drawbuffer, final int[] value, final int value_offset) {
		this.getGL2ES3().glClearBufferuiv(buffer, drawbuffer, value, value_offset);
	}

	@Override
	public final void glCopyBufferSubData(final int readTarget, final int writeTarget, final long readOffset, final long writeOffset, final long size) {
		this.getGL2ES3().glCopyBufferSubData(readTarget, writeTarget, readOffset, writeOffset, size);
	}

	@Override
	public final void glDeleteVertexArrays(final int n, final int[] arrays, final int arrays_offset) {
		this.getGL2ES3().glDeleteVertexArrays(n, arrays, arrays_offset);
	}

	@Override
	public final void glDrawArraysInstanced(final int mode, final int first, final int count, final int instancecount) {
		this.getGL2ES3().glDrawArraysInstanced(mode, first, count, instancecount);
	}

	@Override
	public final void glDrawBuffers(final int n, final int[] bufs, final int bufs_offset) {
		this.getGL2ES3().glDrawBuffers(n, bufs, bufs_offset);
	}

	@Override
	public final void glDrawElementsInstanced(final int mode, final int count, final int type, final long indices_buffer_offset, final int instancecount) {
		this.getGL2ES3().glDrawElementsInstanced(mode, count, type, indices_buffer_offset, instancecount);
	}

	@Override
	public final void glDrawRangeElements(final int mode, final int start, final int end, final int count, final int type, final long indices_buffer_offset) {
		this.getGL2ES3().glDrawRangeElements(mode, start, end, count, type, indices_buffer_offset);
	}

	@Override
	public final void glEndTransformFeedback() {
		this.getGL2ES3().glEndTransformFeedback();
	}

	@Override
	public final void glFramebufferTextureLayer(final int target, final int attachment, final int texture, final int level, final int layer) {
		this.getGL2ES3().glFramebufferTextureLayer(target, attachment, texture, level, layer);
	}

	@Override
	public final void glGenVertexArrays(final int n, final int[] arrays, final int arrays_offset) {
		this.getGL2ES3().glGenVertexArrays(n, arrays, arrays_offset);
	}

	@Override
	public final void glGetActiveUniformBlockName(final int program, final int uniformBlockIndex, final int bufSize, final int[] length, final int length_offset, final byte[] uniformBlockName, final int uniformBlockName_offset) {
		this.getGL2ES3().glGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, length, length_offset, uniformBlockName, uniformBlockName_offset);
	}

	@Override
	public final void glGetActiveUniformBlockiv(final int program, final int uniformBlockIndex, final int pname, final int[] params, final int params_offset) {
		this.getGL2ES3().glGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params, params_offset);
	}

	@Override
	public final void glGetActiveUniformsiv(final int program, final int uniformCount, final int[] uniformIndices, final int uniformIndices_offset, final int pname, final int[] params, final int params_offset) {
		this.getGL2ES3().glGetActiveUniformsiv(program, uniformCount, uniformIndices, uniformIndices_offset, pname, params, params_offset);
	}

	@Override
	public final int glGetFragDataLocation(final int program, final String name) {
		return this.glGetFragDataLocation(program, name);
	}

	@Override
	public final void glGetIntegeri_v(final int target, final int index, final int[] data, final int data_offset) {
		this.getGL2ES3().glGetIntegeri_v(target, index, data, data_offset);
	}

	@Override
	public final void glGetInternalformativ(final int target, final int internalformat, final int pname, final int bufSize, final int[] params, final int params_offset) {
		this.getGL2ES3().glGetInternalformativ(target, internalformat, pname, bufSize, params, params_offset);
	}

	@Override
	public final String glGetStringi(final int name, final int index) {
		return this.getGL2ES3().glGetStringi(name, index);
	}

	@Override
	public final void glGetTransformFeedbackVarying(final int program, final int index, final int bufSize, final int[] length, final int length_offset, final int[] size, final int size_offset, final int[] type, final int type_offset, final byte[] name, final int name_offset) {
		this.getGL2ES3().glGetTransformFeedbackVarying(program, index, bufSize, length, length_offset, size, size_offset, type, type_offset, name, name_offset);
	}

	@Override
	public final int glGetUniformBlockIndex(final int program, final String uniformBlockName) {
		return this.getGL2ES3().glGetUniformBlockIndex(program, uniformBlockName);
	}

	@Override
	public final void glGetUniformIndices(final int program, final int uniformCount, final String[] uniformNames, final int[] uniformIndices, final int uniformIndices_offset) {
		this.getGL2ES3().glGetUniformIndices(program, uniformCount, uniformNames, uniformIndices, uniformIndices_offset);
	}

	@Override
	public final void glGetUniformuiv(final int program, final int location, final int[] params, final int params_offset) {
		this.getGL2ES3().glGetUniformuiv(program, location, params, params_offset);
	}

	@Override
	public final void glGetVertexAttribIiv(final int index, final int pname, final int[] params, final int params_offset) {
		this.getGL2ES3().glGetVertexAttribIiv(index, pname, params, params_offset);
	}

	@Override
	public final void glGetVertexAttribIuiv(final int index, final int pname, final int[] params, final int params_offset) {
		this.getGL2ES3().glGetVertexAttribIuiv(index, pname, params, params_offset);
	}

	@Override
	public final boolean glIsVertexArray(final int array) {
		return this.getGL2ES3().glIsVertexArray(array);
	}

	@Override
	public final void glReadBuffer(final int mode) {
		this.getGL2ES3().glReadBuffer(mode);
	}

	@Override
	public final void glRenderbufferStorageMultisample(final int target, final int samples, final int internalformat, final int width, final int height) {
		this.getGL2ES3().glRenderbufferStorageMultisample(target, samples, internalformat, width, height);
	}

	@Override
	public final void glTransformFeedbackVaryings(final int program, final int count, final String[] varyings, final int bufferMode) {
		this.getGL2ES3().glTransformFeedbackVaryings(program, count, varyings, bufferMode);
	}

	@Override
	public final void glUniform1ui(final int location, final int v0) {
		this.getGL2ES3().glUniform1ui(location, v0);
	}

	@Override
	public final void glUniform1uiv(final int location, final int count, final int[] value, final int value_offset) {
		this.getGL2ES3().glUniform1uiv(location, count, value, value_offset);
	}

	@Override
	public final void glUniform2ui(final int location, final int v0, final int v1) {
		this.getGL2ES3().glUniform2ui(location, v0, v1);
	}

	@Override
	public final void glUniform2uiv(final int location, final int count, final int[] value, final int value_offset) {
		this.getGL2ES3().glUniform2uiv(location, count, value, value_offset);
	}

	@Override
	public final void glUniform3ui(final int location, final int v0, final int v1, final int v2) {
		this.getGL2ES3().glUniform3ui(location, v0, v1, v2);
	}

	@Override
	public final void glUniform3uiv(final int location, final int count, final int[] value, final int value_offset) {
		this.getGL2ES3().glUniform3uiv(location, count, value, value_offset);
	}

	@Override
	public final void glUniform4ui(final int location, final int v0, final int v1, final int v2, final int v3) {
		this.getGL2ES3().glUniform4ui(location, v0, v1, v2, v3);
	}

	@Override
	public final void glUniform4uiv(final int location, final int count, final int[] value, final int value_offset) {
		this.getGL2ES3().glUniform4uiv(location, count, value, value_offset);
	}

	@Override
	public final void glUniformBlockBinding(final int program, final int uniformBlockIndex, final int uniformBlockBinding) {
		this.getGL2ES3().glUniformBlockBinding(program, uniformBlockIndex, uniformBlockBinding);
	}

	@Override
	public final void glUniformMatrix2x3fv(final int location, final int count, final boolean transpose, final float[] value, final int value_offset) {
		this.getGL2ES3().glUniformMatrix2x3fv(location, count, transpose, value, value_offset);
	}

	@Override
	public final void glUniformMatrix2x4fv(final int location, final int count, final boolean transpose, final float[] value, final int value_offset) {
		this.getGL2ES3().glUniformMatrix2x4fv(location, count, transpose, value, value_offset);
	}

	@Override
	public final void glUniformMatrix3x2fv(final int location, final int count, final boolean transpose, final float[] value, final int value_offset) {
		this.getGL2ES3().glUniformMatrix3x2fv(location, count, transpose, value, value_offset);
	}

	@Override
	public final void glUniformMatrix3x4fv(final int location, final int count, final boolean transpose, final float[] value, final int value_offset) {
		this.getGL2ES3().glUniformMatrix3x4fv(location, count, transpose, value, value_offset);
	}

	@Override
	public final void glUniformMatrix4x2fv(final int location, final int count, final boolean transpose, final float[] value, final int value_offset) {
		this.getGL2ES3().glUniformMatrix4x2fv(location, count, transpose, value, value_offset);
	}

	@Override
	public final void glUniformMatrix4x3fv(final int location, final int count, final boolean transpose, final float[] value, final int value_offset) {
		this.getGL2ES3().glUniformMatrix4x3fv(location, count, transpose, value, value_offset);
	}

	@Override
	public final void glVertexAttribI4i(final int index, final int x, final int y, final int z, final int w) {
		this.getGL2ES3().glVertexAttribI4i(index, x, y, z, w);
	}

	@Override
	public final void glVertexAttribI4iv(final int index, final int[] v, final int v_offset) {
		this.getGL2ES3().glVertexAttribI4iv(index, v, v_offset);
	}

	@Override
	public final void glVertexAttribI4ui(final int index, final int x, final int y, final int z, final int w) {
		this.getGL2ES3().glVertexAttribI4ui(index, x, y, z, w);
	}

	@Override
	public final void glVertexAttribI4uiv(final int index, final int[] v, final int v_offset) {
		this.getGL2ES3().glVertexAttribI4uiv(index, v, v_offset);
	}

	@Override
	public final void glVertexAttribIPointer(final int index, final int size, final int type, final int stride, final long pointer_buffer_offset) {
		this.getGL2ES3().glVertexAttribIPointer(index, size, type, stride, pointer_buffer_offset);
	}

}

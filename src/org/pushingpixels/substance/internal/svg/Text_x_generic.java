package org.pushingpixels.substance.internal.svg;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.Icon;
import javax.swing.plaf.UIResource;

import org.pushingpixels.substance.api.icon.IsHiDpiAware;
import org.pushingpixels.substance.api.icon.IsResizable;

/**
 * This class has been automatically generated using <a
 * href="https://flamingo.dev.java.net">Flamingo SVG transcoder</a>.
 */
public class Text_x_generic implements Icon, UIResource, IsResizable, IsHiDpiAware {
	/**
	 * Paints the transcoded SVG image on the specified graphics context. You
	 * can install a custom transformation on the graphics context to scale the
	 * image.
	 * 
	 * @param g
	 *            Graphics context.
	 */
	public static void paint(Graphics2D g) {
        Shape shape = null;
        Paint paint = null;
        Stroke stroke = null;
         
        float origAlpha = 1.0f;
        Composite origComposite = ((Graphics2D)g).getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
	    AffineTransform defaultTransform_ = g.getTransform();
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 0.8f * origAlpha));
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
paint = new RadialGradientPaint(new Point2D.Double(24.309999465942383, 42.099998474121094), 15.82f, new Point2D.Double(24.309999465942383, 42.099998474121094), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0759999752044678f, 0.0f, 0.0f, 0.2849999964237213f, -1.850000023841858f, 30.799999237060547f));
shape = new Ellipse2D.Double(7.299999237060547, 38.29999923706055, 34.0, 9.0);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
paint = new RadialGradientPaint(new Point2D.Double(33.970001220703125, 35.7400016784668), 86.7f, new Point2D.Double(33.970001220703125, 35.7400016784668), new float[] {0.0f,1.0f}, new Color[] {new Color(250, 250, 250, 255),new Color(187, 187, 187, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9610000252723694f, 0.0f, 0.0f, 1.0410000085830688f, 0.0f, 0.0f));
shape = new RoundRectangle2D.Double(6.599999904632568, 3.6500000953674316, 34.880001068115234, 41.0, 2.4000000953674316, 2.4000000953674316);
g.setPaint(paint);
g.fill(shape);
paint = new RadialGradientPaint(new Point2D.Double(8.819999694824219, 3.759999990463257), 37.75f, new Point2D.Double(8.819999694824219, 3.759999990463257), new float[] {0.0f,1.0f}, new Color[] {new Color(163, 163, 163, 255),new Color(76, 76, 76, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9679999947547913f, 0.0f, 0.0f, 1.0329999923706055f, 3.3499999046325684f, 0.6499999761581421f));
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(6.599999904632568, 3.6500000953674316, 34.880001068115234, 41.0, 2.4000000953674316, 2.4000000953674316);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
paint = new RadialGradientPaint(new Point2D.Double(8.140000343322754, 7.269999980926514), 38.2f, new Point2D.Double(8.140000343322754, 7.269999980926514), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(248, 248, 248, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9679999947547913f, 0.0f, 0.0f, 1.0329999923706055f, 3.3499999046325684f, 0.6499999761581421f));
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(7.659999847412109, 4.579999923706055, 32.779998779296875, 39.0, 0.4000000059604645, 0.4000000059604645);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_0
paint = new Color(0, 0, 0, 5);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(11.5, 5.4);
((GeneralPath)shape).lineTo(11.5, 43.300003);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_3_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_1
paint = new Color(255, 255, 255, 51);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(12.5, 5.0);
((GeneralPath)shape).lineTo(12.5, 43.0);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_3_1);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_0_0
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(16.0, 9.0, 20.0, 1.0, 0.4000000059604645, 0.4000000059604645);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_0_1
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(16.0, 11.0, 20.0, 1.0, 0.4000000059604645, 0.4000000059604645);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4_0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_0_2
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(16.0, 13.0, 20.0, 1.0, 0.4000000059604645, 0.4000000059604645);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4_0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_0_3
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(16.0, 15.0, 20.0, 1.0, 0.4000000059604645, 0.4000000059604645);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4_0_3);
g.setTransform(defaultTransform__0_4_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_1
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(16.0, 25.0, 9.0, 1.0, 0.4000000059604645, 0.4000000059604645);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_2
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(16.0, 37.0, 14.0, 1.0, 0.4000000059604645, 0.4000000059604645);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 8.0f));
// _0_4_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_3_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_3_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_3_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_3_0_0
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(16.0, 9.0, 20.0, 1.0, 0.4000000059604645, 0.4000000059604645);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4_3_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_3_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_3_0_1
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(16.0, 11.0, 20.0, 1.0, 0.4000000059604645, 0.4000000059604645);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4_3_0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_3_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_3_0_2
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(16.0, 13.0, 20.0, 1.0, 0.4000000059604645, 0.4000000059604645);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4_3_0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_3_0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_3_0_3
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(16.0, 15.0, 20.0, 1.0, 0.4000000059604645, 0.4000000059604645);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4_3_0_3);
g.setTransform(defaultTransform__0_4_3_0);
g.setTransform(defaultTransform__0_4_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 20.0f));
// _0_4_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_4_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_4_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_4_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_4_0_0
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(16.0, 9.0, 20.0, 1.0, 0.4000000059604645, 0.4000000059604645);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4_4_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_4_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_4_0_1
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(16.0, 11.0, 20.0, 1.0, 0.4000000059604645, 0.4000000059604645);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4_4_0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_4_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_4_0_2
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(16.0, 13.0, 20.0, 1.0, 0.4000000059604645, 0.4000000059604645);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4_4_0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_4_0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_4_0_3
paint = new Color(155, 155, 155, 140);
shape = new RoundRectangle2D.Double(16.0, 15.0, 20.0, 1.0, 0.4000000059604645, 0.4000000059604645);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4_4_0_3);
g.setTransform(defaultTransform__0_4_4_0);
g.setTransform(defaultTransform__0_4_4);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_0
paint = new Color(255, 255, 255, 255);
shape = new Ellipse2D.Double(9.350000381469727, 17.8700008392334, 1.6399999856948853, 1.6399999856948853);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_5_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_1
paint = new RadialGradientPaint(new Point2D.Double(10.100000381469727, 18.81999969482422), 1.21f, new Point2D.Double(10.100000381469727, 18.81999969482422), new float[] {0.0f,1.0f}, new Color[] {new Color(240, 240, 240, 255),new Color(154, 154, 154, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new Ellipse2D.Double(9.0, 17.610000610351562, 1.6399999856948853, 1.6399999856948853);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_5_1);
g.setTransform(defaultTransform__0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 11.5f));
// _0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6_0_0
paint = new Color(255, 255, 255, 255);
shape = new Ellipse2D.Double(9.350000381469727, 17.8700008392334, 1.6399999856948853, 1.6399999856948853);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_6_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6_0_1
paint = new RadialGradientPaint(new Point2D.Double(10.100000381469727, 18.81999969482422), 1.21f, new Point2D.Double(10.100000381469727, 18.81999969482422), new float[] {0.0f,1.0f}, new Color[] {new Color(240, 240, 240, 255),new Color(154, 154, 154, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new Ellipse2D.Double(9.0, 17.610000610351562, 1.6399999856948853, 1.6399999856948853);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_6_0_1);
g.setTransform(defaultTransform__0_6_0);
g.setTransform(defaultTransform__0_6);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static int getOrigX() {
        return 7;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static int getOrigY() {
        return 4;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static int getOrigWidth() {
		return 36;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static int getOrigHeight() {
		return 45;
	}

	/**
	 * The current width of this resizable icon.
	 */
	int width;

	/**
	 * The current height of this resizable icon.
	 */
	int height;

	/**
	 * Creates a new transcoded SVG image.
	 */
	public Text_x_generic() {
        this.width = getOrigWidth();
        this.height = getOrigHeight();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#getIconHeight()
	 */
    @Override
	public int getIconHeight() {
		return height;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#getIconWidth()
	 */
    @Override
	public int getIconWidth() {
		return width;
	}

	@Override
    public void setDimension(Dimension newDimension) {
        this.width = newDimension.width;
        this.height = newDimension.height;
    }
    
    @Override
    public boolean isHiDpiAware() {
        return true;
    }

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#paintIcon(java.awt.Component, java.awt.Graphics,
	 * int, int)
	 */
    @Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.translate(x, y);

		double coef1 = (double) this.width / (double) getOrigWidth();
		double coef2 = (double) this.height / (double) getOrigHeight();
		double coef = Math.min(coef1, coef2);
		g2d.scale(coef, coef);
		paint(g2d);
		g2d.dispose();
	}
}

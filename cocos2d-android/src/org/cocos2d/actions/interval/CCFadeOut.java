package org.cocos2d.actions.interval;

import org.cocos2d.nodes.CCNode;

/** Fades Out an object that implements the CCRGBAProtocol protocol.
 * It modifies the opacity from 255 to 0.
 * The "reverse" of this action is FadeIn
*/
public class CCFadeOut extends CCIntervalAction {

    public static CCFadeOut action(float t) {
        return new CCFadeOut(t);
    }

    protected CCFadeOut(float t) {
        super(t);
    }

    @Override
    public void update(float t) {
        ((CCNode.CCRGBAProtocol) target).setOpacity((byte) (255.0f * (1 - t)));
    }

    @Override
    public CCFadeIn reverse() {
        return new CCFadeIn(duration);
    }
}
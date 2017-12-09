package pers.scruel.listener;

import pers.scruel.gui.TipsFrame;
import pers.scruel.util.ClipboardUtil;

/**
 * @author Scruel Tao <scruel@vip.qq.com>
 */
public class UploadAction extends BaseAction {
  public UploadAction(TipsFrame frame) {
    super(frame);
  }

  @Override
  public void afterActionCompleted() {
    if (super.getSucceedSum() > 0) {
      ClipboardUtil.setClipBoard(getResult().toString());
    }
  }
}

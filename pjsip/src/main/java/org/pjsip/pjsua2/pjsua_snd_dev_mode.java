/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public final class pjsua_snd_dev_mode {
  public final static pjsua_snd_dev_mode PJSUA_SND_DEV_SPEAKER_ONLY = new pjsua_snd_dev_mode("PJSUA_SND_DEV_SPEAKER_ONLY", pjsua2JNI.PJSUA_SND_DEV_SPEAKER_ONLY_get());
  public final static pjsua_snd_dev_mode PJSUA_SND_DEV_NO_IMMEDIATE_OPEN = new pjsua_snd_dev_mode("PJSUA_SND_DEV_NO_IMMEDIATE_OPEN", pjsua2JNI.PJSUA_SND_DEV_NO_IMMEDIATE_OPEN_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static pjsua_snd_dev_mode swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + pjsua_snd_dev_mode.class + " with value " + swigValue);
  }

  private pjsua_snd_dev_mode(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private pjsua_snd_dev_mode(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private pjsua_snd_dev_mode(String swigName, pjsua_snd_dev_mode swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static pjsua_snd_dev_mode[] swigValues = { PJSUA_SND_DEV_SPEAKER_ONLY, PJSUA_SND_DEV_NO_IMMEDIATE_OPEN };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}


/*
 * Copyright (C) 2008 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.media;

/**
 * The AudioFormat class is used to access a number of audio format and
 * channel configuration constants. They are for instance used
 * in {@link AudioTrack} and {@link AudioRecord}.
 * 
 */
public class AudioFormat {
    
    //---------------------------------------------------------
    // Constants
    //--------------------
    /** Invalid audio data format */
    public static final int ENCODING_INVALID = 0;
    /** Default audio data format */
    public static final int ENCODING_DEFAULT = 1;

    // These values must be kept in sync with core/jni/android_media_AudioFormat.h
    /** Audio data format: PCM 16 bit per sample. Guaranteed to be supported by devices. */
    public static final int ENCODING_PCM_16BIT = 2;
    /** Audio data format: PCM 8 bit per sample. Not guaranteed to be supported by devices. */
    public static final int ENCODING_PCM_8BIT = 3;
    /** @hide Candidate for public API */
    public static final int ENCODING_PCM_FLOAT = 4;

    /** Invalid audio channel configuration */
    /** @deprecated use CHANNEL_INVALID instead  */
    @Deprecated    public static final int CHANNEL_CONFIGURATION_INVALID   = 0;
    /** Default audio channel configuration */
    /** @deprecated use CHANNEL_OUT_DEFAULT or CHANNEL_IN_DEFAULT instead  */
    @Deprecated    public static final int CHANNEL_CONFIGURATION_DEFAULT   = 1;
    /** Mono audio configuration */
    /** @deprecated use CHANNEL_OUT_MONO or CHANNEL_IN_MONO instead  */
    @Deprecated    public static final int CHANNEL_CONFIGURATION_MONO      = 2;
    /** Stereo (2 channel) audio configuration */
    /** @deprecated use CHANNEL_OUT_STEREO or CHANNEL_IN_STEREO instead  */
    @Deprecated    public static final int CHANNEL_CONFIGURATION_STEREO    = 3;

    /** Invalid audio channel mask */
    public static final int CHANNEL_INVALID = 0;
    /** Default audio channel mask */
    public static final int CHANNEL_OUT_DEFAULT = 1;

    // Output channel mask definitions below are translated to the native values defined in
    //  in /system/core/include/system/audio.h in the JNI code of AudioTrack
    public static final int CHANNEL_OUT_FRONT_LEFT = 0x4;
    public static final int CHANNEL_OUT_FRONT_RIGHT = 0x8;
    public static final int CHANNEL_OUT_FRONT_CENTER = 0x10;
    public static final int CHANNEL_OUT_LOW_FREQUENCY = 0x20;
    public static final int CHANNEL_OUT_BACK_LEFT = 0x40;
    public static final int CHANNEL_OUT_BACK_RIGHT = 0x80;
    public static final int CHANNEL_OUT_FRONT_LEFT_OF_CENTER = 0x100;
    public static final int CHANNEL_OUT_FRONT_RIGHT_OF_CENTER = 0x200;
    public static final int CHANNEL_OUT_BACK_CENTER = 0x400;
    /** @hide */
    public static final int CHANNEL_OUT_SIDE_LEFT =         0x800;
    /** @hide */
    public static final int CHANNEL_OUT_SIDE_RIGHT =       0x1000;
    /** @hide */
    public static final int CHANNEL_OUT_TOP_CENTER =       0x2000;
    /** @hide */
    public static final int CHANNEL_OUT_TOP_FRONT_LEFT =   0x4000;
    /** @hide */
    public static final int CHANNEL_OUT_TOP_FRONT_CENTER = 0x8000;
    /** @hide */
    public static final int CHANNEL_OUT_TOP_FRONT_RIGHT = 0x10000;
    /** @hide */
    public static final int CHANNEL_OUT_TOP_BACK_LEFT =   0x20000;
    /** @hide */
    public static final int CHANNEL_OUT_TOP_BACK_CENTER = 0x40000;
    /** @hide */
    public static final int CHANNEL_OUT_TOP_BACK_RIGHT =  0x80000;

    public static final int CHANNEL_OUT_MONO = CHANNEL_OUT_FRONT_LEFT;
    public static final int CHANNEL_OUT_STEREO = (CHANNEL_OUT_FRONT_LEFT | CHANNEL_OUT_FRONT_RIGHT);
    // aka QUAD_BACK
    public static final int CHANNEL_OUT_QUAD = (CHANNEL_OUT_FRONT_LEFT | CHANNEL_OUT_FRONT_RIGHT |
            CHANNEL_OUT_BACK_LEFT | CHANNEL_OUT_BACK_RIGHT);
    /** @hide */
    public static final int CHANNEL_OUT_QUAD_SIDE = (CHANNEL_OUT_FRONT_LEFT | CHANNEL_OUT_FRONT_RIGHT |
            CHANNEL_OUT_SIDE_LEFT | CHANNEL_OUT_SIDE_RIGHT);
    public static final int CHANNEL_OUT_SURROUND = (CHANNEL_OUT_FRONT_LEFT | CHANNEL_OUT_FRONT_RIGHT |
            CHANNEL_OUT_FRONT_CENTER | CHANNEL_OUT_BACK_CENTER);
    // aka 5POINT1_BACK
    public static final int CHANNEL_OUT_5POINT1 = (CHANNEL_OUT_FRONT_LEFT | CHANNEL_OUT_FRONT_RIGHT |
            CHANNEL_OUT_FRONT_CENTER | CHANNEL_OUT_LOW_FREQUENCY | CHANNEL_OUT_BACK_LEFT | CHANNEL_OUT_BACK_RIGHT);
    /** @hide */
    public static final int CHANNEL_OUT_5POINT1_SIDE = (CHANNEL_OUT_FRONT_LEFT | CHANNEL_OUT_FRONT_RIGHT |
            CHANNEL_OUT_FRONT_CENTER | CHANNEL_OUT_LOW_FREQUENCY |
            CHANNEL_OUT_SIDE_LEFT | CHANNEL_OUT_SIDE_RIGHT);
    // TODO does this need an @deprecated ?
    // different from AUDIO_CHANNEL_OUT_7POINT1
    public static final int CHANNEL_OUT_7POINT1 = (CHANNEL_OUT_FRONT_LEFT | CHANNEL_OUT_FRONT_RIGHT |
            CHANNEL_OUT_FRONT_CENTER | CHANNEL_OUT_LOW_FREQUENCY | CHANNEL_OUT_BACK_LEFT | CHANNEL_OUT_BACK_RIGHT |
            CHANNEL_OUT_FRONT_LEFT_OF_CENTER | CHANNEL_OUT_FRONT_RIGHT_OF_CENTER);
    /** @hide */
    // matches AUDIO_CHANNEL_OUT_7POINT1
    public static final int CHANNEL_OUT_7POINT1_SURROUND = (
            CHANNEL_OUT_FRONT_LEFT | CHANNEL_OUT_FRONT_CENTER | CHANNEL_OUT_FRONT_RIGHT |
            CHANNEL_OUT_SIDE_LEFT | CHANNEL_OUT_SIDE_RIGHT |
            CHANNEL_OUT_BACK_LEFT | CHANNEL_OUT_BACK_RIGHT |
            CHANNEL_OUT_LOW_FREQUENCY);
    // CHANNEL_OUT_ALL is not yet defined; if added then it should match AUDIO_CHANNEL_OUT_ALL

    public static final int CHANNEL_IN_DEFAULT = 1;
    // These directly match native
    public static final int CHANNEL_IN_LEFT = 0x4;
    public static final int CHANNEL_IN_RIGHT = 0x8;
    public static final int CHANNEL_IN_FRONT = 0x10;
    public static final int CHANNEL_IN_BACK = 0x20;
    public static final int CHANNEL_IN_LEFT_PROCESSED = 0x40;
    public static final int CHANNEL_IN_RIGHT_PROCESSED = 0x80;
    public static final int CHANNEL_IN_FRONT_PROCESSED = 0x100;
    public static final int CHANNEL_IN_BACK_PROCESSED = 0x200;
    public static final int CHANNEL_IN_PRESSURE = 0x400;
    public static final int CHANNEL_IN_X_AXIS = 0x800;
    public static final int CHANNEL_IN_Y_AXIS = 0x1000;
    public static final int CHANNEL_IN_Z_AXIS = 0x2000;
    public static final int CHANNEL_IN_VOICE_UPLINK = 0x4000;
    public static final int CHANNEL_IN_VOICE_DNLINK = 0x8000;
    public static final int CHANNEL_IN_MONO = CHANNEL_IN_FRONT;
    public static final int CHANNEL_IN_STEREO = (CHANNEL_IN_LEFT | CHANNEL_IN_RIGHT);
    /** @hide */
    public static final int CHANNEL_IN_FRONT_BACK = CHANNEL_IN_FRONT | CHANNEL_IN_BACK;
    // CHANNEL_IN_ALL is not yet defined; if added then it should match AUDIO_CHANNEL_IN_ALL

    /** @hide */
    public static int getBytesPerSample(int audioFormat)
    {
        switch (audioFormat) {
        case ENCODING_PCM_8BIT:
            return 1;
        case ENCODING_PCM_16BIT:
        case ENCODING_DEFAULT:
            return 2;
        case ENCODING_INVALID:
        default:
            throw new IllegalArgumentException("Bad audio format " + audioFormat);
        }
    }

}

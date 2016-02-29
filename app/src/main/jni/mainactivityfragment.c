#include <jni.h>

JNIEXPORT jstring JNICALL
Java_com_dsleng_android_intelligensia_MainActivityFragment_getMessage(JNIEnv *env,
                                                                      jobject instance) {

    return (*env)->NewStringUTF(env, "SP HELLO FROM JNI");
}
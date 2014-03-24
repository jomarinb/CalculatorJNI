#include <jni.h>
#include <stdio.h>
#include "Arithmetics.h"

// Implementation of native methods

JNIEXPORT jdouble JNICALL Java_Arithmetics_addValues (JNIEnv *env, jobject jobj, jdouble xValue, jdouble yValue){
    return xValue + yValue;
}

JNIEXPORT jdouble JNICALL Java_Arithmetics_substractValues(JNIEnv *env, jobject jobj, jdouble xValue, jdouble yValue){
    return xValue - yValue;
}

JNIEXPORT jdouble JNICALL Java_Arithmetics_multiplyValues(JNIEnv *env, jobject jobj, jdouble xValue, jdouble yValue){
    return xValue * yValue;
}

JNIEXPORT jdouble JNICALL Java_Arithmetics_divideValues(JNIEnv *env, jobject jobj, jdouble xValue, jdouble yValue){
    return xValue / yValue;
}



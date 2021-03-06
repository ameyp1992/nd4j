#include <reduce.h>

__device__ double update(double old,double opOutput,double *extraParams) {
       return opOutput;
 }

/**
 An op on the device
 @param d1 the first operator
 @param d2 the second operator
*/
__device__ double op(double d1,double d2,double *extraParams) {
      return d1 + d2;
}

__device__ double op(double d1,double *extraParams) {
       return d1;
}



__device__ double postProcess(double reduction,int n,int xOffset,double *dx,int incx,double *extraParams,double *result) {
             return reduction / (double) n;
}


extern "C"
__global__ void mean_strided_double(int n, int xOffset,double *dx,int incx,double *extraParams,double *result) {
             transform(n,xOffset,dx,incx,extraParams,result);
}



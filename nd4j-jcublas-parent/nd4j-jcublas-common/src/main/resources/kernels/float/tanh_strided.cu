#include <transform.h>


__device__ float op(float d1,float *params) {
        return tanhf(d1);
}

extern "C"
__global__ void tanh_strided_float(int n,int idx,float *dy,int incy,float *params,float *result) {
       transform(n,idx,dy,incy,params,result);

 }
#include <transform.h>


__device__ double op(double d1,double *params) {
        return tanhf(d1);
}

extern "C"
__global__ void tanh_strided_double(int n,int idx,double *dy,int incy,double *params,double *result) {
       transform(n,idx,dy,incy,params,result);

 }
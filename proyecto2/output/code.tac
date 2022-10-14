	_r0 <- n = 1
	_r1 <- not _r0
l_0 := _r2 <- 1 # f
	_r3 <- n = 2
	_r4 <- not _r3
l_1 := _r5 <- 1 # f
	_r6 <- call fibonacci
	_r7 <- n - 1
	_r8 <- call fibonacci
	_r9 <- n - 2
	_r10 <- _r6 + _r8
l_2 := _r11 <- _r10 # f
l_3 := _r12 <- goto l_1 if _r3
	_r13 <- goto l_2 if _r4
	_r14 <- goto l_0 if _r0
	_r15 <- goto l_3 if _r1
	_r16 <- let _r14
	_r17 <- f
	_r18 <- _r16
	_r19 <- 5 + 6
	_r20 <- _r19 # n
	_r21 <- 5 + 6
	_r22 <- _r21 # n
	_r23 <- true
	_r24 <- _r23 # s
	_r25 <- not s
	_r26 <- _r25 # t
	_r27 <- new Fibonacci
	_r28 <- _r27 # myfibonacci
	_r29 <- call out_int

	_t0 <- n = 1
	_t1 <- not _t0
l_0 := _t2 <- 1 @ f
	_t3 <- n = 2
	_t4 <- not _t3
l_1 := _t5 <- 1 @ f
	_t6 <- n - 1
	_t7 <- goto fibonacci (_t6)
	_t8 <- n - 2
	_t9 <- goto fibonacci (_t8)
	_t10 <- _t7 + _t9
l_2 := _t11 <- _t10 @ f
l_3 := goto l_1 if _t3
	goto l_2 if _t4
l_4 := goto l_0 if _t0
	goto l_3 if _t1
	_t16 <- let l_4
	_t17 <- f
l_5 := _t18 <- _t16
	_t19 <- goto (fibonacci) l_5
	_t20 <- 5 + 6
l_6 := _t21 <- _t20 @ n
	_t22 <- goto (fibonacci) l_6
	_t23 <- goto (copy) self
	_t24 <- 5 + 6
l_7 := _t25 <- _t24 @ n
	_t26 <- true
	_t27 <- _t26 @ s
	_t28 <- not s
	_t29 <- _t28 @ t
	_t30 <- new Fibonacci
	_t31 <- _t30 @ myfibonacci
	_t32 <- goto myfibonacci.fibonacci (n)
	_t33 <- goto out_int (_t32)
	_t34 <- goto (main) l_7

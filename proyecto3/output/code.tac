	_t0 <- 1
	_t1 <- 4
	_t2 <- _t0 + _t1
	_t3 <- 5
	_t4 <- 11
	_t5 <- _t3 + _t4
	_t6 <- 1
	_t7 <- 2
	_t8 <- _t6 * _t7
	_t9 <- _t8
	_t10 <- _t5 - _t9
	_t11 <- 10
	_t12 <- 1
	_t13 <- "Hello, World.\n"
l_1 := 
	_t14 <- call out_string, _t13
	_t15 <- call in_int, None
	_t16 <- _t15 @ d
	_t17 <- call out_int, d
	_t18 <- "\n"
	_t19 <- call out_string, _t18
	_t20 <- call out_int, a
	_t21 <- "\n"
	_t22 <- call out_string, _t21
	_t23 <- call out_int, b
	_t24 <- "\n"
	_t25 <- call out_string, _t24
	_t26 <- 1
	_t27 <- 2
	_t28 <- _t26 + _t27
	_t29 <- _t28 @ c
	_t30 <- call out_int, c
	_t31 <- i <= cont
	_t32 <- "\n"
l_0 := 
	_t33 <- call out_string, _t32
	_t34 <- call out_int, i
	_t35 <- 1
	_t36 <- i + _t35
	_t37 <- _t36 @ i
	goto l_0 if _t31
	goto l_1

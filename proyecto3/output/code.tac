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
	_t15 <- call out_int, a
	_t16 <- "\n"
	_t17 <- call out_string, _t16
	_t18 <- call out_int, b
	_t19 <- "\n"
	_t20 <- call out_string, _t19
	_t21 <- 1
	_t22 <- 2
	_t23 <- _t21 + _t22
	_t24 <- _t23 @ c
	_t25 <- call out_int, c
	_t26 <- i <= cont
	_t27 <- "\n"
l_0 := 
	_t28 <- call out_string, _t27
	_t29 <- call out_int, i
	_t30 <- 1
	_t31 <- i + _t30
	_t32 <- _t31 @ i
	goto l_0 if _t26
	goto l_1

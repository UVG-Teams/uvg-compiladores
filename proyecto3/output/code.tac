	_t0 <- 1
	_t1 <- 4
	_t2 <- _t0 + _t1
	_t3 <- 10
	_t4 <- 1
	_t5 <- "Hello, World.\n"
l_1 := 
	_t6 <- call out_string, _t5
	_t7 <- call out_int, a
	_t8 <- i <= cont
	_t9 <- "\n"
l_0 := 
	_t10 <- call out_string, _t9
	_t11 <- call out_int, i
	_t12 <- 1
	_t13 <- i + _t12
	_t14 <- _t13 @ i
	goto l_0 if _t8
	goto l_1

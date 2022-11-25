.data
	_t0: .word 15
	_t1: .word 6
	_t2: .word 11
	_t3: .word 1
	_t8: .word 1
	_t9: .word 4

	_t4 <- _t2 - _t3
	_t5 <- _t4
	_t6 <- _t1 * _t5
	_t7 <- _t0 + _t6
	_t10 <- _t8 + _t9

.text
.globl main
main:
	_t11 <- call out_int, a
	goto l_0

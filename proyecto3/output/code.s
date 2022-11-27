.data
	_t0: .word 1
	_t1: .word 4
	_a: .word 0
	_t3: .word 5
	_t4: .word 11
	_t5: .word 0
	_t6: .word 1
	_t7: .word 2
	_t8: .word 0
	_t9: .word 0
	_b: .word 0
	_cont: .word 10
	_t12: .word 1
	_t13: .asciiz "Hello, World.\n"
	_t16: .asciiz "\n"
	_t19: .asciiz "\n"
	_t21: .word 1
	_t22: .word 2
	_t23: .word 0
	_c: .word 0
	_t26: .word 0
	_t27: .asciiz "\n"
	_t30: .word 1
	_t31: .word 0
	_i: .word 0


.text
.globl main
main:

	#_t2 <- _t0 + _t1
	lw $t1, _t0
	lw $t2, _t1
	add $t0, $t1, $t2
	sw $t0, _a

	#_t5 <- _t3 + _t4
	lw $t1, _t3
	lw $t2, _t4
	add $t0, $t1, $t2
	sw $t0, _t5

	#_t8 <- _t6 * _t7
	lw $t1, _t6
	lw $t2, _t7
	mul $t0, $t1, $t2
	sw $t0, _t8

	# Movement
	lw $t1, _t8
	sw $t1, _t9
	#_t9 <- _t8

	#_t10 <- _t5 - _t9
	lw $t1, _t5
	lw $t2, _t9
	sub $t0, $t1, $t2
	sw $t0, _b

	# Out String
	la $a0, _t13
	li $v0, 4
	syscall

	# Out Int
	lw $a0, _a
	li $v0, 1
	syscall

	# Out String
	la $a0, _t16
	li $v0, 4
	syscall

	# Out Int
	lw $a0, _b
	li $v0, 1
	syscall

	# Out String
	la $a0, _t19
	li $v0, 4
	syscall

	#_t23 <- _t21 + _t22
	lw $t1, _t21
	lw $t2, _t22
	add $t0, $t1, $t2
	sw $t0, _t23

	#_t24 <- _t23 # c
	lw $t0, _t23
	sw $t0, _c

	# Out Int
	lw $a0, _c
	li $v0, 1
	syscall


l_0:
	# Out String
	la $a0, _t27
	li $v0, 4
	syscall

	# Out Int
	lw $a0, _i
	li $v0, 1
	syscall

	#_t31 <- i + _t30
	lw $t1, _i
	lw $t2, _t30
	add $t0, $t1, $t2
	sw $t0, _t31

	#_t32 <- _t31 # i
	lw $t0, _t31
	sw $t0, _i

	#goto l_0 if _t26
	#_t26 <- i <= cont
	lw $t1, _i
	lw $t2, _cont
	ble $t1, $t2, l_0

	#goto l_1

exit_program:
	li $v0, 10
	syscall
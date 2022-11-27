.data
	_t0: .word 1
	_t1: .word 4
	_a: .word 0
	_cont: .word 10
	_t4: .word 1
	_t5: .asciiz "Hello, World.\n"
	_t8: .word 0
	_t9: .asciiz "\n"
	_t12: .word 1
	_t13: .word 0
	_i: .word 0


.text
.globl main
main:

	#_t2 <- _t0 + _t1
	lw $t1, _t0
	lw $t2, _t1
	add $t0, $t1, $t2
	sw $t0, _a

	# Out String
	la $a0, _t5
	li $v0, 4
	syscall

	# Out Int
	lw $a0, _a
	li $v0, 1
	syscall


l_0:
	# Out String
	la $a0, _t9
	li $v0, 4
	syscall

	# Out Int
	lw $a0, _i
	li $v0, 1
	syscall

	#_t13 <- i + _t12
	lw $t1, _i
	lw $t2, _t12
	add $t0, $t1, $t2
	sw $t0, _t13

	#_t14 <- _t13 # i
	lw $t0, _t13
	sw $t0, _i

	#goto l_0 if _t8
	#_t8 <- i <= cont
	lw $t1, _i
	lw $t2, _cont
	ble $t1, $t2, l_0

	#goto l_1

exit_program:
	li $v0, 10
	syscall
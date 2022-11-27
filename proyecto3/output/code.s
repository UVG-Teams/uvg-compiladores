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
	_t15: .word 0
	_d: .word 0
	_t18: .asciiz "\n"
	_t21: .asciiz "\n"
	_t24: .asciiz "\n"
	_t26: .word 1
	_t27: .word 2
	_t28: .word 0
	_c: .word 0
	_t31: .word 0
	_t32: .asciiz "\n"
	_t35: .word 1
	_t36: .word 0
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

	# Output String
	la $a0, _t13
	li $v0, 4
	syscall

	# Input Int
	li $v0, 5
	syscall
	move $t0, $v0
	sw $t0, _t15

	#_t16 <- _t15 # d
	lw $t0, _t15
	sw $t0, _d

	# Output Int
	lw $a0, _d
	li $v0, 1
	syscall

	# Output String
	la $a0, _t18
	li $v0, 4
	syscall

	# Output Int
	lw $a0, _a
	li $v0, 1
	syscall

	# Output String
	la $a0, _t21
	li $v0, 4
	syscall

	# Output Int
	lw $a0, _b
	li $v0, 1
	syscall

	# Output String
	la $a0, _t24
	li $v0, 4
	syscall

	#_t28 <- _t26 + _t27
	lw $t1, _t26
	lw $t2, _t27
	add $t0, $t1, $t2
	sw $t0, _t28

	#_t29 <- _t28 # c
	lw $t0, _t28
	sw $t0, _c

	# Output Int
	lw $a0, _c
	li $v0, 1
	syscall


l_0:
	# Output String
	la $a0, _t32
	li $v0, 4
	syscall

	# Output Int
	lw $a0, _i
	li $v0, 1
	syscall

	#_t36 <- i + _t35
	lw $t1, _i
	lw $t2, _t35
	add $t0, $t1, $t2
	sw $t0, _t36

	#_t37 <- _t36 # i
	lw $t0, _t36
	sw $t0, _i

	#goto l_0 if _t31
	#_t31 <- i <= cont
	lw $t1, _i
	lw $t2, _cont
	ble $t1, $t2, l_0

	#goto l_1

exit_program:
	li $v0, 10
	syscall
.data
	_t0: .asciiz "Hello, World.\n"
	_a: .word 0
	_t3: .asciiz "\n"


.text
.globl main
main:

	# Out String
	la $a0, _t0
	li $v0, 4
	syscall

	# In Int
	li $v0, 5
	syscall
	move $t0, $v0
	sw $t0, _a

	# Out Int
	lw $a0, _a
	li $v0, 1
	syscall

	# Out String
	la $a0, _t3
	li $v0, 4
	syscall

exit_program:
	li $v0, 10
	syscall
.data
	_t0: .asciiz "Hello, World.\n"
	_t3: .word 0
	_t5: .asciiz "\n"


.text
.globl main
main:

	# Output String
	la $a0, _t0
	li $v0, 4
	syscall

	# Input Int
	li $v0, 5
	syscall
	move $t0, $v0
	sw $t0, _t3


	# Output Int
	lw $a0, _t3
	li $v0, 1
	syscall

	# Output String
	la $a0, _t5
	li $v0, 4
	syscall

	#goto l_0

exit_program:
	li $v0, 10
	syscall
_0 := n = 1
_1 := not _0
_2 := f <- 1
_3 := goto _2 if _0
_4 := n = 2
_5 := not _4
_6 := f <- 1
_7 := goto _6 if _4
_8 := call fibonacci
_9 := n - 1
_10 := call fibonacci
_11 := n - 2
_12 := _8 + _10
_13 := f <- _12
_14 := goto _13 if _5
_15 := goto _7 if _1
_16 := let _3
_17 := f
_18 := _16
_19 := 5 + 6
_20 := n <- _19
_21 := true
_22 := s <- _21
_23 := not s
_24 := t <- _23
_25 := new Fibonacci
_26 := myfibonacci <- _25
_27 := call out_int

package com.performance.module_0_34

class Feature34UseCase2(
    private val repository: Feature34Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}

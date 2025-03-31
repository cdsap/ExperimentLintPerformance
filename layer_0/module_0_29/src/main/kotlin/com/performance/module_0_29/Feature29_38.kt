package com.performance.module_0_29

class Feature29UseCase2(
    private val repository: Feature29Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}

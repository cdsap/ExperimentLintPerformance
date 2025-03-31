package com.performance.module_0_68

class Feature68UseCase2(
    private val repository: Feature68Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}

package com.performance.module_3_68

class Feature68UseCase2(
    private val repository: Feature68Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}

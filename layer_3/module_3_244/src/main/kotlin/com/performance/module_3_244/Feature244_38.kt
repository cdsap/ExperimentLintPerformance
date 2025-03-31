package com.performance.module_3_244

class Feature244UseCase2(
    private val repository: Feature244Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}

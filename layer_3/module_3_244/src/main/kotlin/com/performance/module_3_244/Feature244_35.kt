package com.performance.module_3_244

class Feature244UseCase1(
    private val repository: Feature244Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}

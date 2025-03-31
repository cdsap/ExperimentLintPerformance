package com.performance.module_1_183

class Feature183UseCase1(
    private val repository: Feature183Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}

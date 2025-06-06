package com.performance.module_1_183

class Feature183UseCase2(
    private val repository: Feature183Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}

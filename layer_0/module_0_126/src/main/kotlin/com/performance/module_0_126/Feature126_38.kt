package com.performance.module_0_126

class Feature126UseCase2(
    private val repository: Feature126Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}

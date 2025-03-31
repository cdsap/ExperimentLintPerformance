package com.performance.module_1_126

class Feature126UseCase1(
    private val repository: Feature126Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}

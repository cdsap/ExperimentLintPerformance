package com.performance.module_1_126

class Feature126UseCase0(
    private val repository: Feature126Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}

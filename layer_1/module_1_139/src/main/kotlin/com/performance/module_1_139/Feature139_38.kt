package com.performance.module_1_139

class Feature139UseCase2(
    private val repository: Feature139Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}

package com.performance.module_2_139

class Feature139UseCase1(
    private val repository: Feature139Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}

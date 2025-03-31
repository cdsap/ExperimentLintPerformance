package com.performance.module_4_280

class Feature280UseCase1(
    private val repository: Feature280Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}

package com.performance.module_4_280

class Feature280UseCase2(
    private val repository: Feature280Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}

package com.performance.module_4_280

class Feature280UseCase0(
    private val repository: Feature280Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}

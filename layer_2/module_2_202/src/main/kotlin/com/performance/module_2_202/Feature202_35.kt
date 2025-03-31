package com.performance.module_2_202

class Feature202UseCase1(
    private val repository: Feature202Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
